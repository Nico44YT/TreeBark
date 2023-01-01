package net.letscode.treebark.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.item.ItemStack;
import net.minecraft.item.AxeItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.letscode.treebark.item.WarpedBarkItem;
import net.letscode.treebark.item.SpruceBarkItem;
import net.letscode.treebark.item.OakBarkItem;
import net.letscode.treebark.item.JungleBarkItem;
import net.letscode.treebark.item.DarkOakBarkItem;
import net.letscode.treebark.item.CrimsonBarkItem;
import net.letscode.treebark.item.BirchBarkItem;
import net.letscode.treebark.item.AcaciaBarkItem;
import net.letscode.treebark.TreebarkMod;

import java.util.Map;
import java.util.HashMap;

public class GettingBarkProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
			PlayerEntity entity = event.getPlayer();
			if (event.getHand() != entity.getActiveHand()) {
				return;
			}
			double i = event.getPos().getX();
			double j = event.getPos().getY();
			double k = event.getPos().getZ();
			IWorld world = event.getWorld();
			BlockState state = world.getBlockState(event.getPos());
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("direction", event.getFace());
			dependencies.put("blockstate", state);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TreebarkMod.LOGGER.warn("Failed to load dependency world for procedure GettingBark!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TreebarkMod.LOGGER.warn("Failed to load dependency x for procedure GettingBark!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TreebarkMod.LOGGER.warn("Failed to load dependency y for procedure GettingBark!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TreebarkMod.LOGGER.warn("Failed to load dependency z for procedure GettingBark!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TreebarkMod.LOGGER.warn("Failed to load dependency entity for procedure GettingBark!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() instanceof AxeItem
				|| net.minecraftforge.fml.ModList.get().isLoaded("tconstruct")
						&& ItemTags.getCollection().getTagByID(new ResourceLocation("treebark:tc_axe")).contains(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem())
						&& !entity.isSneaking()) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.ACACIA_LOG
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.ACACIA_WOOD) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(AcaciaBarkItem.block));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.BIRCH_LOG
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.BIRCH_WOOD) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(BirchBarkItem.block));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.CRIMSON_STEM
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.CRIMSON_HYPHAE) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(CrimsonBarkItem.block));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DARK_OAK_LOG
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DARK_OAK_WOOD) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(DarkOakBarkItem.block));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.JUNGLE_LOG
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.JUNGLE_WOOD) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(JungleBarkItem.block));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.OAK_LOG
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.OAK_WOOD) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(OakBarkItem.block));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.SPRUCE_LOG
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.SPRUCE_WOOD) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(SpruceBarkItem.block));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WARPED_STEM
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WARPED_HYPHAE) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(WarpedBarkItem.block));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
