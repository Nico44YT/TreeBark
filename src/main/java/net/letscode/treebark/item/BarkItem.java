package net.letscode.treebark.item;

import net.letscode.treebark.tag.TreeBarkTags;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

public class BarkItem extends Item {

    HashMap<ResourceLocation, ResourceLocation> map;
    int burnTime = 60;

    public BarkItem(Properties settings, HashMap<ResourceLocation, ResourceLocation> map) {
        super(settings);
        this.map = map;
    }

    public BarkItem(Properties settings, HashMap<ResourceLocation, ResourceLocation> map, int burnTime) {
        super(settings);
        this.map = map;
        this.burnTime = burnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return burnTime;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {

        if(!context.getLevel().isClientSide() && context.getHand() == InteractionHand.MAIN_HAND) {

            final BlockPos blockPos = new BlockPos(context.getClickedPos());
            final Level world = context.getLevel();
            final Player player = context.getPlayer();

            if(map.containsKey(ForgeRegistries.BLOCKS.getKey(world.getBlockState(blockPos).getBlock()))) {
                changeBlock(context, player, world, blockPos, ForgeRegistries.BLOCKS.getValue(map.get(ForgeRegistries.BLOCKS.getKey(world.getBlockState(blockPos).getBlock()))));
            }

        }

        return super.useOn(context);
    }

    public void changeBlock(UseOnContext context, Player player, Level world, BlockPos blockPos, Block base) {

        player.swing(InteractionHand.MAIN_HAND, true);
        world.playSound(null, blockPos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1f, 1f);
        world.setBlockAndUpdate(blockPos, base.withPropertiesOf(world.getBlockState(blockPos)));
        if (!player.isCreative()) {
            context.getItemInHand().shrink(1);
        }

    }
}
