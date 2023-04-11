
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.letscode.treebark.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TreebarkModTabs {
	public static CreativeModeTab TAB_BARK_TAB;

	public static void load() {
		TAB_BARK_TAB = new CreativeModeTab("tabbark_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TreebarkModItems.OAK_BARK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
