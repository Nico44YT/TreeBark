
package net.letscode.treebark.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.letscode.treebark.item.OakBarkItem;
import net.letscode.treebark.TreebarkModElements;

@TreebarkModElements.ModElement.Tag
public class BarkTabItemGroup extends TreebarkModElements.ModElement {
	public BarkTabItemGroup(TreebarkModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbark_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(OakBarkItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
