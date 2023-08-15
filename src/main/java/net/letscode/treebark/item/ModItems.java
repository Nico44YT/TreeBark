package net.letscode.treebark.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.letscode.treebark.TreeBark;
import net.letscode.treebark.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

public class ModItems {

    public static final Item ACACIA_BARK = registerItem("acacia_bark", new AcaciaBarkItem(new FabricItemSettings()));
    public static final Item BIRCH_BARK = registerItem("birch_bark", new BirchBarkItem(new FabricItemSettings()));
    public static final Item CRIMSON_BARK = registerItem("crimson_bark", new CrimsonBarkItem(new FabricItemSettings()));
    public static final Item DARK_OAK_BARK = registerItem("dark_oak_bark", new DarkOakBarkItem(new FabricItemSettings()));
    public static final Item JUNGLE_BARK = registerItem("jungle_bark", new JungleBarkItem(new FabricItemSettings()));
    public static final Item MANGROVE_BARK = registerItem("mangrove_bark", new MangroveBarkItem(new FabricItemSettings()));
    public static final Item OAK_BARK = registerItem("oak_bark", new OakBarkItem(new FabricItemSettings()));
    public static final Item SPRUCE_BARK = registerItem("spruce_bark", new SpruceBarkItem(new FabricItemSettings()));
    public static final Item WARPED_BARK = registerItem("warped_bark", new WarpedBarkItem(new FabricItemSettings()));


    private static Item registerItem(String name, Item item){
        addToItemGroup(ModItemGroup.TREEBARK, item);
        return Registry.register(Registries.ITEM, new Identifier(TreeBark.MOD_ID, name), item);
    }


    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(content -> {
            content.add(item);
        });
    }

    public static void registerModItems() {
        TreeBark.LOGGER.debug("Registering Mod Items for %s", TreeBark.MOD_ID);
    }
}
