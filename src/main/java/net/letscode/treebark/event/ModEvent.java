package net.letscode.treebark.event;

import net.letscode.treebark.TreeBark;
import net.letscode.treebark.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;


@Mod.EventBusSubscriber(modid = TreeBark.MOD_ID)
public class ModEvent {
    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        if(event.getItemStack().getItem() instanceof AxeItem) {
            Block base = event.getLevel().getBlockState(event.getPos()).getBlock();
            if(ModItems.itemMap.containsKey(ForgeRegistries.BLOCKS.getKey(base))) {
                spawnItem(event.getLevel(), event.getPos(), ModItems.itemMap.get(ForgeRegistries.BLOCKS.getKey(base)).get().asItem());
            }
        }
    }

    public static void spawnItem(Level world, BlockPos blockPos, Item item) {
        world.addFreshEntity(new ItemEntity(world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), new ItemStack(item)));
    }
}
