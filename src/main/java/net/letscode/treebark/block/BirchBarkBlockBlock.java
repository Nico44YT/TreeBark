
package net.letscode.treebark.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.IWorld;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.Direction;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.StateContainer;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.BooleanProperty;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.BlockItem;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.FluidState;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.letscode.treebark.itemgroup.BarkTabItemGroup;
import net.letscode.treebark.TreebarkModElements;

import java.util.List;
import java.util.Collections;

@TreebarkModElements.ModElement.Tag
public class BirchBarkBlockBlock extends TreebarkModElements.ModElement {
	@ObjectHolder("treebark:birch_bark_block")
	public static final Block block = null;

	public BirchBarkBlockBlock(TreebarkModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(BarkTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
	}

	public static class CustomBlock extends Block implements IWaterLoggable {
		public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;
		public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0).notSolid()
					.setOpaque((bs, br, bp) -> false));
			this.setDefaultState(this.stateContainer.getBaseState().with(AXIS, Direction.Axis.Y).with(WATERLOGGED, false));
			setRegistryName("birch_bark_block");
		}

		@Override
		public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
			return state.getFluidState().isEmpty();
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 0;
		}

		@Override
		public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
			Vector3d offset = state.getOffset(world, pos);
			switch ((Direction.Axis) state.get(AXIS)) {
				case X :
					return VoxelShapes
							.combineAndSimplify(VoxelShapes.or(makeCuboidShape(0, 0, 0, 16, 16, 16)),
									VoxelShapes.or(makeCuboidShape(0, 1, 1, 16, 15, 15)), IBooleanFunction.ONLY_FIRST)
							.withOffset(offset.x, offset.y, offset.z);
				case Y :
				default :
					return VoxelShapes
							.combineAndSimplify(VoxelShapes.or(makeCuboidShape(0, 0, 0, 16, 16, 16)),
									VoxelShapes.or(makeCuboidShape(1, 0, 1, 15, 16, 15)), IBooleanFunction.ONLY_FIRST)
							.withOffset(offset.x, offset.y, offset.z);
				case Z :
					return VoxelShapes
							.combineAndSimplify(VoxelShapes.or(makeCuboidShape(0, 0, 16, 16, 16, 0)),
									VoxelShapes.or(makeCuboidShape(1, 1, 16, 15, 15, 0)), IBooleanFunction.ONLY_FIRST)
							.withOffset(offset.x, offset.y, offset.z);
			}
		}

		@Override
		protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
			builder.add(AXIS, WATERLOGGED);
		}

		@Override
		public BlockState getStateForPlacement(BlockItemUseContext context) {
			boolean flag = context.getWorld().getFluidState(context.getPos()).getFluid() == Fluids.WATER;
			return this.getDefaultState().with(AXIS, context.getFace().getAxis()).with(WATERLOGGED, flag);
		}

		@Override
		public BlockState rotate(BlockState state, Rotation rot) {
			if (rot == Rotation.CLOCKWISE_90 || rot == Rotation.COUNTERCLOCKWISE_90) {
				if ((Direction.Axis) state.get(AXIS) == Direction.Axis.X) {
					return state.with(AXIS, Direction.Axis.Z);
				} else if ((Direction.Axis) state.get(AXIS) == Direction.Axis.Z) {
					return state.with(AXIS, Direction.Axis.X);
				}
			}
			return state;
		}

		@Override
		public FluidState getFluidState(BlockState state) {
			return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
		}

		@Override
		public BlockState updatePostPlacement(BlockState state, Direction facing, BlockState facingState, IWorld world, BlockPos currentPos,
				BlockPos facingPos) {
			if (state.get(WATERLOGGED)) {
				world.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(world));
			}
			return super.updatePostPlacement(state, facing, facingState, world, currentPos, facingPos);
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
