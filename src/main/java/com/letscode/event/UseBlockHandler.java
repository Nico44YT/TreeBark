package com.letscode.event;

import com.letscode.item.ModItems;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.mixin.content.registry.AxeItemAccessor;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UseBlockHandler implements UseBlockCallback {

    @Override
    public ActionResult interact(PlayerEntity player, World world, Hand hand, BlockHitResult hitResult) {
        final BlockPos blockPos = hitResult.getBlockPos();

        if(!player.isSpectator() && hand == Hand.MAIN_HAND){
            if(player.getMainHandStack().getItem() instanceof AxeItemAccessor){
                if(world.getBlockState(blockPos).getBlock() == Blocks.ACACIA_LOG || world.getBlockState(blockPos).getBlock() == Blocks.ACACIA_WOOD){
                    SpawnItem(world, player, blockPos, new ItemStack(ModItems.ACACIA_BARK));
                } else
                if(world.getBlockState(blockPos).getBlock() == Blocks.BIRCH_LOG || world.getBlockState(blockPos).getBlock() == Blocks.BIRCH_WOOD){
                    SpawnItem(world, player, blockPos, new ItemStack(ModItems.BIRCH_BARK));
                } else
                if(world.getBlockState(blockPos).getBlock() == Blocks.CRIMSON_STEM || world.getBlockState(blockPos).getBlock() == Blocks.CRIMSON_HYPHAE){
                    SpawnItem(world, player, blockPos, new ItemStack(ModItems.CRIMSON_BARK));
                } else
                if(world.getBlockState(blockPos).getBlock() == Blocks.DARK_OAK_LOG || world.getBlockState(blockPos).getBlock() == Blocks.DARK_OAK_WOOD){
                    SpawnItem(world, player, blockPos, new ItemStack(ModItems.DARK_OAK_BARK));
                } else
                if(world.getBlockState(blockPos).getBlock() == Blocks.JUNGLE_LOG || world.getBlockState(blockPos).getBlock() == Blocks.JUNGLE_WOOD){
                    SpawnItem(world, player, blockPos, new ItemStack(ModItems.JUNGLE_BARK));
                } else
                if(world.getBlockState(blockPos).getBlock() == Blocks.MANGROVE_LOG || world.getBlockState(blockPos).getBlock() == Blocks.MANGROVE_WOOD){
                    SpawnItem(world, player, blockPos, new ItemStack(ModItems.MANGROVE_BARK));
                } else
                if(world.getBlockState(blockPos).getBlock() == Blocks.OAK_LOG || world.getBlockState(blockPos).getBlock() == Blocks.OAK_WOOD){
                    SpawnItem(world, player, blockPos, new ItemStack(ModItems.OAK_BARK));
                } else
                if(world.getBlockState(blockPos).getBlock() == Blocks.SPRUCE_LOG || world.getBlockState(blockPos).getBlock() == Blocks.SPRUCE_WOOD){
                    SpawnItem(world, player, blockPos, new ItemStack(ModItems.SPRUCE_BARK));
                } else
                if(world.getBlockState(blockPos).getBlock() == Blocks.WARPED_STEM || world.getBlockState(blockPos).getBlock() == Blocks.WARPED_HYPHAE){
                    SpawnItem(world, player, blockPos, new ItemStack(ModItems.WARPED_BARK));
                }
            }

        }
        return ActionResult.PASS;
    }

    private static void SpawnItem(World world, PlayerEntity player, BlockPos blockPos, ItemStack item) {
        world.spawnEntity(new ItemEntity(world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), item));
    }
}
