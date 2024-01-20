package net.letscode.treebark.registries;

import net.letscode.treebark.item.BarkReference;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BarkRegistry {
    public static List<BarkReference> references = new ArrayList<BarkReference>();

    public static void register() {
        HashMap<ResourceLocation, ResourceLocation> ACACIA_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        ACACIA_BLOCKS.put(new ResourceLocation("minecraft:stripped_acacia_log"), new ResourceLocation("minecraft:acacia_log"));
        ACACIA_BLOCKS.put(new ResourceLocation("minecraft:stripped_acacia_wood"), new ResourceLocation("minecraft:acacia_wood"));

        HashMap<ResourceLocation, ResourceLocation> BIRCH_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        BIRCH_BLOCKS.put(new ResourceLocation("minecraft:stripped_birch_log"), new ResourceLocation("minecraft:birch_log"));
        BIRCH_BLOCKS.put(new ResourceLocation("minecraft:stripped_birch_wood"), new ResourceLocation("minecraft:birch_wood"));

        HashMap<ResourceLocation, ResourceLocation> CRIMSON_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        CRIMSON_BLOCKS.put(new ResourceLocation("minecraft:stripped_crimson_stem"), new ResourceLocation("minecraft:crimson_stem"));
        CRIMSON_BLOCKS.put(new ResourceLocation("minecraft:stripped_crimson_hyphae"), new ResourceLocation("minecraft:crimson_hyphae"));

        HashMap<ResourceLocation, ResourceLocation> DARK_OAK_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        DARK_OAK_BLOCKS.put(new ResourceLocation("minecraft:stripped_dark_oak_log"), new ResourceLocation("minecraft:dark_oak_log"));
        DARK_OAK_BLOCKS.put(new ResourceLocation("minecraft:stripped_dark_oak_wood"), new ResourceLocation("minecraft:dark_oak_wood"));

        HashMap<ResourceLocation, ResourceLocation> JUNGLE_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        JUNGLE_BLOCKS.put(new ResourceLocation("minecraft:stripped_jungle_log"), new ResourceLocation("minecraft:jungle_log"));
        JUNGLE_BLOCKS.put(new ResourceLocation("minecraft:stripped_jungle_wood"), new ResourceLocation("minecraft:jungle_wood"));

        HashMap<ResourceLocation, ResourceLocation> MANGROVE_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        MANGROVE_BLOCKS.put(new ResourceLocation("minecraft:stripped_mangrove_log"), new ResourceLocation("minecraft:mangrove_log"));
        MANGROVE_BLOCKS.put(new ResourceLocation("minecraft:stripped_mangrove_wood"), new ResourceLocation("minecraft:mangrove_wood"));

        HashMap<ResourceLocation, ResourceLocation> OAK_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        OAK_BLOCKS.put(new ResourceLocation("minecraft:stripped_oak_log"), new ResourceLocation("minecraft:oak_log"));
        OAK_BLOCKS.put(new ResourceLocation("minecraft:stripped_oak_wood"), new ResourceLocation("minecraft:oak_wood"));

        HashMap<ResourceLocation, ResourceLocation> SPRUCE_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        SPRUCE_BLOCKS.put(new ResourceLocation("minecraft:stripped_spruce_log"), new ResourceLocation("minecraft:spruce_log"));
        SPRUCE_BLOCKS.put(new ResourceLocation("minecraft:stripped_spruce_wood"), new ResourceLocation("minecraft:spruce_wood"));

        HashMap<ResourceLocation, ResourceLocation> WARPED_BLOCKS = new HashMap<ResourceLocation, ResourceLocation>();
        WARPED_BLOCKS.put(new ResourceLocation("minecraft:stripped_warped_stem"), new ResourceLocation("minecraft:warped_stem"));
        WARPED_BLOCKS.put(new ResourceLocation("minecraft:stripped_warped_hyphae"), new ResourceLocation("minecraft:warped_hyphae"));

        references.add(new BarkReference(ACACIA_BLOCKS, "acacia_bark"));
        references.add(new BarkReference(BIRCH_BLOCKS, "birch_bark"));
        references.add(new BarkReference(CRIMSON_BLOCKS, "crimson_bark"));
        references.add(new BarkReference(DARK_OAK_BLOCKS, "dark_oak_bark"));
        references.add(new BarkReference(JUNGLE_BLOCKS, "jungle_bark"));
        references.add(new BarkReference(MANGROVE_BLOCKS, "mangrove_bark"));
        references.add(new BarkReference(OAK_BLOCKS, "oak_bark"));
        references.add(new BarkReference(SPRUCE_BLOCKS, "spruce_bark"));
        references.add(new BarkReference(WARPED_BLOCKS, "warped_bark"));
    }
}
