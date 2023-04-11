
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.letscode.treebark.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class TreebarkModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == TreebarkModItems.ACACIA_BARK.get())
			event.setBurnTime(40);
		else if (itemstack.getItem() == TreebarkModItems.BIRCH_BARK.get())
			event.setBurnTime(40);
		else if (itemstack.getItem() == TreebarkModItems.DARK_OAK_BARK.get())
			event.setBurnTime(40);
		else if (itemstack.getItem() == TreebarkModItems.JUNGLE_BARK.get())
			event.setBurnTime(40);
		else if (itemstack.getItem() == TreebarkModItems.OAK_BARK.get())
			event.setBurnTime(40);
		else if (itemstack.getItem() == TreebarkModItems.SPRUCE_BARK.get())
			event.setBurnTime(40);
		else if (itemstack.getItem() == TreebarkModBlocks.ACACIA_BARK_BLOCK.get().asItem())
			event.setBurnTime(160);
		else if (itemstack.getItem() == TreebarkModBlocks.BIRCH_BARK_BLOCK.get().asItem())
			event.setBurnTime(160);
		else if (itemstack.getItem() == TreebarkModBlocks.DARK_OAK_BARK_BLOCK.get().asItem())
			event.setBurnTime(160);
		else if (itemstack.getItem() == TreebarkModBlocks.JUNGLE_BARK_BLOCK.get().asItem())
			event.setBurnTime(160);
		else if (itemstack.getItem() == TreebarkModBlocks.OAK_BARK_BLOCK.get().asItem())
			event.setBurnTime(160);
		else if (itemstack.getItem() == TreebarkModBlocks.SPRUCE_BARK_BLOCK.get().asItem())
			event.setBurnTime(160);
	}
}
