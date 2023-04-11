package com.letscode.registries;

import com.letscode.event.UseBlockHandler;
import com.letscode.item.ModItems;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistry {

    public static void registerModFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.ACACIA_BARK, 40);
        registry.add(ModItems.BIRCH_BARK, 40);
        registry.add(ModItems.CRIMSON_BARK, 60);
        registry.add(ModItems.DARK_OAK_BARK, 40);
        registry.add(ModItems.JUNGLE_BARK, 40);
        registry.add(ModItems.MANGROVE_BARK, 40);
        registry.add(ModItems.OAK_BARK, 40);
        registry.add(ModItems.SPRUCE_BARK, 40);
        registry.add(ModItems.WARPED_BARK, 60);
    }

    public static void registerEvents(){
        UseBlockCallback.EVENT.register(new UseBlockHandler());
    }
}
