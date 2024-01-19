package net.letscode.treebark.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.RegistryObject;

import java.util.Random;

public class ModCreativeTab {
    public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab("treebark.bark_tab") {
        @Override
        public ItemStack makeIcon() {
            Random rand = new Random();
            RegistryObject<Item> item = (RegistryObject<Item>) ModItems.ITEMS.getEntries().toArray()[rand.nextInt(0, ModItems.ITEMS.getEntries().size())];
            return new ItemStack(item.get());
        }
    };
}
