package net.letscode.treebark.item.custom;

import net.letscode.treebark.item.ModItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CrimsonBarkItem extends Item {

    public CrimsonBarkItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND) {

            final BlockPos blockPos = new BlockPos(context.getBlockPos());
            final World world = context.getWorld();
            final PlayerEntity player = context.getPlayer();

            if (world.getBlockState(blockPos).getBlock() == Blocks.STRIPPED_CRIMSON_STEM || world.getBlockState(blockPos).getBlock() == Blocks.STRIPPED_CRIMSON_HYPHAE){
                player.swingHand(Hand.MAIN_HAND, true);
                world.playSound(null, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1f, 1f);

                if (!player.isCreative()) {
                    context.getStack().decrement(1);
                }
            }

            if (world.getBlockState(blockPos).getBlock() == Blocks.STRIPPED_CRIMSON_STEM) {
                world.setBlockState(blockPos, Blocks.CRIMSON_STEM.getStateWithProperties(world.getBlockState(blockPos)));
            }
            if (world.getBlockState(blockPos).getBlock() == Blocks.STRIPPED_CRIMSON_HYPHAE) {
                world.setBlockState(blockPos, Blocks.CRIMSON_HYPHAE.getStateWithProperties(world.getBlockState(blockPos)));
            }
        }
        return super.useOnBlock(context);
    }


}
