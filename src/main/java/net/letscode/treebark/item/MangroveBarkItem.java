
package net.letscode.treebark.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.letscode.treebark.init.TreebarkModTabs;

public class MangroveBarkItem extends Item {
	public MangroveBarkItem() {
		super(new Item.Properties().tab(TreebarkModTabs.TAB_BARK_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
