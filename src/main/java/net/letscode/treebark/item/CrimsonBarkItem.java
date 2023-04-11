
package net.letscode.treebark.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.letscode.treebark.TreebarkModElements;

@TreebarkModElements.ModElement.Tag
public class CrimsonBarkItem extends TreebarkModElements.ModElement {
	@ObjectHolder("treebark:crimson_bark")
	public static final Item block = null;

	public CrimsonBarkItem(TreebarkModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(BarkTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("crimson_bark");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
