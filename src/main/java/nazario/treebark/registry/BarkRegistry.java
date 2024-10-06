package nazario.treebark.registry;

import nazario.liby.registry.auto.LibyAutoRegister;
import nazario.treebark.item.BarkReference;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@LibyAutoRegister(priority = 0)
public class BarkRegistry {
    public static List<BarkReference> references = new ArrayList<BarkReference>();
    public static void register() {
        HashMap<Identifier, Identifier> ACACIA_BLOCKS = new HashMap<Identifier, Identifier>();
        ACACIA_BLOCKS.put(Identifier.of("minecraft:stripped_acacia_log"), Identifier.of("minecraft:acacia_log"));
        ACACIA_BLOCKS.put(Identifier.of("minecraft:stripped_acacia_wood"), Identifier.of("minecraft:acacia_wood"));

        HashMap<Identifier, Identifier> BIRCH_BLOCKS = new HashMap<Identifier, Identifier>();
        BIRCH_BLOCKS.put(Identifier.of("minecraft:stripped_birch_log"), Identifier.of("minecraft:birch_log"));
        BIRCH_BLOCKS.put(Identifier.of("minecraft:stripped_birch_wood"), Identifier.of("minecraft:birch_wood"));

        HashMap<Identifier, Identifier> BAMBOO_BLOCKS = new HashMap<Identifier, Identifier>();
        BIRCH_BLOCKS.put(Identifier.of("minecraft:stripped_bamboo_block"), Identifier.of("minecraft:bamboo_block"));

        HashMap<Identifier, Identifier> CHERRY_BLOCKS = new HashMap<Identifier, Identifier>();
        CHERRY_BLOCKS.put(Identifier.of("minecraft:stripped_cherry_log"), Identifier.of("minecraft:cherry_log"));
        CHERRY_BLOCKS.put(Identifier.of("minecraft:stripped_cherry_wood"), Identifier.of("minecraft:cherry_wood"));

        HashMap<Identifier, Identifier> CRIMSON_BLOCKS = new HashMap<Identifier, Identifier>();
        CRIMSON_BLOCKS.put(Identifier.of("minecraft:stripped_crimson_stem"), Identifier.of("minecraft:crimson_stem"));
        CRIMSON_BLOCKS.put(Identifier.of("minecraft:stripped_crimson_hyphae"), Identifier.of("minecraft:crimson_hyphae"));

        HashMap<Identifier, Identifier> DARK_OAK_BLOCKS = new HashMap<Identifier, Identifier>();
        DARK_OAK_BLOCKS.put(Identifier.of("minecraft:stripped_dark_oak_log"), Identifier.of("minecraft:dark_oak_log"));
        DARK_OAK_BLOCKS.put(Identifier.of("minecraft:stripped_dark_oak_wood"), Identifier.of("minecraft:dark_oak_wood"));

        HashMap<Identifier, Identifier> JUNGLE_BLOCKS = new HashMap<Identifier, Identifier>();
        JUNGLE_BLOCKS.put(Identifier.of("minecraft:stripped_jungle_log"), Identifier.of("minecraft:jungle_log"));
        JUNGLE_BLOCKS.put(Identifier.of("minecraft:stripped_jungle_wood"), Identifier.of("minecraft:jungle_wood"));

        HashMap<Identifier, Identifier> MANGROVE_BLOCKS = new HashMap<Identifier, Identifier>();
        MANGROVE_BLOCKS.put(Identifier.of("minecraft:stripped_mangrove_log"), Identifier.of("minecraft:mangrove_log"));
        MANGROVE_BLOCKS.put(Identifier.of("minecraft:stripped_mangrove_wood"), Identifier.of("minecraft:mangrove_wood"));

        HashMap<Identifier, Identifier> OAK_BLOCKS = new HashMap<Identifier, Identifier>();
        OAK_BLOCKS.put(Identifier.of("minecraft:stripped_oak_log"), Identifier.of("minecraft:oak_log"));
        OAK_BLOCKS.put(Identifier.of("minecraft:stripped_oak_wood"), Identifier.of("minecraft:oak_wood"));

        HashMap<Identifier, Identifier> SPRUCE_BLOCKS = new HashMap<Identifier, Identifier>();
        SPRUCE_BLOCKS.put(Identifier.of("minecraft:stripped_spruce_log"), Identifier.of("minecraft:spruce_log"));
        SPRUCE_BLOCKS.put(Identifier.of("minecraft:stripped_spruce_wood"), Identifier.of("minecraft:spruce_wood"));

        HashMap<Identifier, Identifier> WARPED_BLOCKS = new HashMap<Identifier, Identifier>();
        WARPED_BLOCKS.put(Identifier.of("minecraft:stripped_warped_stem"), Identifier.of("minecraft:warped_stem"));
        WARPED_BLOCKS.put(Identifier.of("minecraft:stripped_warped_hyphae"), Identifier.of("minecraft:warped_hyphae"));



        references.add(new BarkReference(ACACIA_BLOCKS, Identifier.of("treebark","acacia_bark")));
        references.add(new BarkReference(BAMBOO_BLOCKS, Identifier.of("treebark","bamboo_bark")));
        references.add(new BarkReference(BIRCH_BLOCKS, Identifier.of("treebark","birch_bark")));
        references.add(new BarkReference(CHERRY_BLOCKS, Identifier.of("treebark","cherry_bark")));
        references.add(new BarkReference(CRIMSON_BLOCKS, Identifier.of("treebark","crimson_bark")));
        references.add(new BarkReference(DARK_OAK_BLOCKS, Identifier.of("treebark","dark_oak_bark")));
        references.add(new BarkReference(JUNGLE_BLOCKS, Identifier.of("treebark","jungle_bark")));
        references.add(new BarkReference(MANGROVE_BLOCKS, Identifier.of("treebark","mangrove_bark")));
        references.add(new BarkReference(OAK_BLOCKS, Identifier.of("treebark","oak_bark")));
        references.add(new BarkReference(SPRUCE_BLOCKS, Identifier.of("treebark","spruce_bark")));
        references.add(new BarkReference(WARPED_BLOCKS, Identifier.of("treebark","warped_bark")));
    }
}
