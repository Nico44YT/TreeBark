package net.letscode.treebark.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

import java.util.Random;

public class TBCreativeTab {
    public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab("treebark.bark_tab") {
        @Override
        public ItemStack makeIcon() {
            Random rand = new Random();
            int randomIndex = rand.nextInt(0, TBItems.ITEMS.getEntries().size());
            RegistryObject<Item> item = (RegistryObject<Item>) TBItems.ITEMS.getEntries().toArray()[randomIndex];
            return new ItemStack(item.get());
        }
    };
}
