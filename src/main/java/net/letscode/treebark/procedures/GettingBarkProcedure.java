package net.letscode.treebark.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.letscode.treebark.init.TreebarkModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GettingBarkProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getPlayer().getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.is(ItemTags.create(new ResourceLocation("treebark:tc_axe"))) && !entity.isShiftKeyDown()) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.ACACIA_LOG
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.ACACIA_WOOD) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TreebarkModItems.ACACIA_BARK.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.BIRCH_LOG
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.BIRCH_WOOD) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TreebarkModItems.BIRCH_BARK.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.CRIMSON_STEM
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.CRIMSON_HYPHAE) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TreebarkModItems.CRIMSON_BARK.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DARK_OAK_LOG
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DARK_OAK_WOOD) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TreebarkModItems.DARK_OAK_BARK.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.JUNGLE_LOG
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.JUNGLE_WOOD) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TreebarkModItems.JUNGLE_BARK.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.OAK_LOG
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.OAK_WOOD) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TreebarkModItems.OAK_BARK.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.SPRUCE_LOG
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.SPRUCE_WOOD) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TreebarkModItems.SPRUCE_BARK.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WARPED_STEM
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WARPED_HYPHAE) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TreebarkModItems.WARPED_BARK.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
