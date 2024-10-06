package nazario.treebark.registry;

import nazario.liby.registry.auto.LibyAutoRegister;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.HashMap;

@LibyAutoRegister(priority = 0)
public class BarkTypeRegistry {
    public static HashMap<Block, Block> ACACIA_BLOCKS = new HashMap<Block, Block>();
    public static HashMap<Block, Block> BAMBOO_BLOCKS = new HashMap<Block, Block>();
    public static HashMap<Block, Block> BIRCH_BLOCKS = new HashMap<Block, Block>();
    public static HashMap<Block, Block> CRIMSON_BLOCKS = new HashMap<Block, Block>();
    public static HashMap<Block, Block> CHERRY_BLOCKS = new HashMap<Block, Block>();
    public static HashMap<Block, Block> DARK_OAK_BLOCKS = new HashMap<Block, Block>();
    public static HashMap<Block, Block> JUNGLE_BLOCKS = new HashMap<Block, Block>();
    public static HashMap<Block, Block> MANGROVE_BLOCKS = new HashMap<Block, Block>();
    public static HashMap<Block, Block> OAK_BLOCKS = new HashMap<Block, Block>();
    public static HashMap<Block, Block> SPRUCE_BLOCKS = new HashMap<Block, Block>();
    public static HashMap<Block, Block> WARPED_BLOCKS = new HashMap<Block, Block>();

    public static void register() {
        ACACIA_BLOCKS.put(Blocks.STRIPPED_ACACIA_LOG, Blocks.ACACIA_LOG);
        ACACIA_BLOCKS.put(Blocks.STRIPPED_ACACIA_WOOD, Blocks.ACACIA_WOOD);

        BAMBOO_BLOCKS.put(Blocks.STRIPPED_BAMBOO_BLOCK, Blocks.BAMBOO_BLOCK);

        BIRCH_BLOCKS.put(Blocks.STRIPPED_BIRCH_LOG, Blocks.BIRCH_LOG);
        BIRCH_BLOCKS.put(Blocks.STRIPPED_BIRCH_WOOD, Blocks.BIRCH_WOOD);

        CRIMSON_BLOCKS.put(Blocks.STRIPPED_CRIMSON_STEM, Blocks.CRIMSON_STEM);
        CRIMSON_BLOCKS.put(Blocks.STRIPPED_CRIMSON_HYPHAE, Blocks.CRIMSON_HYPHAE);

        CHERRY_BLOCKS.put(Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_LOG);
        CHERRY_BLOCKS.put(Blocks.STRIPPED_CHERRY_WOOD, Blocks.CHERRY_WOOD);

        DARK_OAK_BLOCKS.put(Blocks.STRIPPED_DARK_OAK_LOG, Blocks.DARK_OAK_LOG);
        DARK_OAK_BLOCKS.put(Blocks.STRIPPED_DARK_OAK_WOOD, Blocks.DARK_OAK_WOOD);

        JUNGLE_BLOCKS.put(Blocks.STRIPPED_JUNGLE_LOG, Blocks.JUNGLE_LOG);
        JUNGLE_BLOCKS.put(Blocks.STRIPPED_JUNGLE_WOOD, Blocks.JUNGLE_WOOD);

        MANGROVE_BLOCKS.put(Blocks.STRIPPED_MANGROVE_LOG, Blocks.MANGROVE_LOG);
        MANGROVE_BLOCKS.put(Blocks.STRIPPED_MANGROVE_WOOD, Blocks.MANGROVE_WOOD);

        OAK_BLOCKS.put(Blocks.STRIPPED_OAK_LOG, Blocks.OAK_LOG);
        OAK_BLOCKS.put(Blocks.STRIPPED_OAK_WOOD, Blocks.OAK_WOOD);

        SPRUCE_BLOCKS.put(Blocks.STRIPPED_SPRUCE_LOG, Blocks.SPRUCE_LOG);
        SPRUCE_BLOCKS.put(Blocks.STRIPPED_SPRUCE_WOOD, Blocks.SPRUCE_WOOD);

        WARPED_BLOCKS.put(Blocks.STRIPPED_WARPED_STEM, Blocks.WARPED_STEM);
        WARPED_BLOCKS.put(Blocks.STRIPPED_WARPED_HYPHAE, Blocks.WARPED_HYPHAE);
    }
}
