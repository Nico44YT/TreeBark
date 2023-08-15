package net.letscode.treebark.event;

import net.letscode.treebark.TreeBark;
import net.letscode.treebark.item.ModItems;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.mixin.content.registry.AxeItemAccessor;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class UseBlockHandler implements UseBlockCallback {

    @Override
    public ActionResult interact(PlayerEntity player, World world, Hand hand, BlockHitResult hitResult) {
        final BlockPos blockPos = hitResult.getBlockPos();
        final BlockState block = world.getBlockState(blockPos);

        if(!player.isSpectator() && hand == Hand.MAIN_HAND){
            if(player.getMainHandStack().getItem() instanceof AxeItemAccessor){
                if(block.getBlock() == Blocks.ACACIA_LOG || block.getBlock() == Blocks.ACACIA_WOOD){
                    this.SpawnItem(world, player, blockPos, new ItemStack(ModItems.ACACIA_BARK));
                } else
                if(block.getBlock() == Blocks.BIRCH_LOG || block.getBlock() == Blocks.BIRCH_WOOD){
                    this.SpawnItem(world, player, blockPos, new ItemStack(ModItems.BIRCH_BARK));
                } else
                if(block.getBlock() == Blocks.CRIMSON_STEM || block.getBlock() == Blocks.CRIMSON_HYPHAE){
                    this.SpawnItem(world, player, blockPos, new ItemStack(ModItems.CRIMSON_BARK));
                } else
                if(block.getBlock() == Blocks.DARK_OAK_LOG || block.getBlock() == Blocks.DARK_OAK_WOOD){
                    this.SpawnItem(world, player, blockPos, new ItemStack(ModItems.DARK_OAK_BARK));
                } else
                if(block.getBlock() == Blocks.JUNGLE_LOG || block.getBlock() == Blocks.JUNGLE_WOOD){
                    this.SpawnItem(world, player, blockPos, new ItemStack(ModItems.JUNGLE_BARK));
                } else
                if(block.getBlock() == Blocks.MANGROVE_LOG || block.getBlock() == Blocks.MANGROVE_WOOD){
                    this.SpawnItem(world, player, blockPos, new ItemStack(ModItems.MANGROVE_BARK));
                } else
                if(block.getBlock() == Blocks.OAK_LOG || block.getBlock() == Blocks.OAK_WOOD){
                    this.SpawnItem(world, player, blockPos, new ItemStack(ModItems.OAK_BARK));
                } else
                if(block.getBlock() == Blocks.SPRUCE_LOG || block.getBlock() == Blocks.SPRUCE_WOOD){
                    this.SpawnItem(world, player, blockPos, new ItemStack(ModItems.SPRUCE_BARK));
                } else
                if(block.getBlock() == Blocks.WARPED_STEM || block.getBlock() == Blocks.WARPED_HYPHAE){
                    this.SpawnItem(world, player, blockPos, new ItemStack(ModItems.WARPED_BARK));
                }
            }
        }
        return ActionResult.PASS;
    }

    private static void SpawnItem(World world, PlayerEntity player, BlockPos blockPos, ItemStack item) {
        world.spawnEntity(new ItemEntity(world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), item));
    }

    private Block getExternalBlock(String mod_id, String block_id) {
        if(Registry.BLOCK.containsId(new Identifier(mod_id, block_id))) {
            BlockState block = Registry.BLOCK.get(new Identifier(mod_id, block_id)).getDefaultState();
            return block.getBlock();
        }
        return null;
    }
}
