package net.letscode.treebark.item;

import net.letscode.treebark.TreeBark;
import net.letscode.treebark.registries.BarkRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;
import java.util.HashMap;

public class ModItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TreeBark.MOD_ID);

    public static HashMap<ResourceLocation, RegistryObject<Item>> itemMap = new HashMap<ResourceLocation, RegistryObject<Item>>();

    public static void registerBarks() {
        for(int i = 0; i< BarkRegistry.references.size(); i++) {
            BarkReference reference = BarkRegistry.references.get(i);

            RegistryObject<Item> barkItem = ITEMS.register(reference.registryName, () -> new BarkItem(new Item.Properties().tab(ModCreativeTab.CREATIVE_TAB), reference.map));

            for(ResourceLocation blockResourceLocation : reference.map.values()) {
                itemMap.put(blockResourceLocation, barkItem);
            }

        }
    }

    public static void register(IEventBus eventBus) {
        registerBarks();
        ITEMS.register(eventBus);
    }
}
