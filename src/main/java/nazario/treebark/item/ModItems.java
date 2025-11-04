package nazario.treebark.item;

//? if >=1.20 {
import nazario.stonecutterutil.StoneCutterItemGroup;
import nazario.stonecutterutil.StoneCutterUtil;
import nazario.treebark.Treebark;
import nazario.treebark.api.BarkRegistry;
import nazario.treebark.item.custom.BarkItem;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
//?} else {
/*import nazario.stonecutterutil.StoneCutterItemGroup;
import nazario.stonecutterutil.StoneCutterUtil;
import nazario.treebark.Treebark;
import nazario.treebark.api.BarkRegistry;
import nazario.treebark.item.custom.BarkItem;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
*///?}

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ModItems {
    public static final List<Item> ALL = new ArrayList<>();

    public static final BarkItem OAK_BARK = registerItem("oak_bark", new Item.Settings(), BarkItem::new, StoneCutterItemGroup.INGREDIENTS);
    public static final BarkItem SPRUCE_BARK = registerItem("spruce_bark", new Item.Settings(), BarkItem::new, StoneCutterItemGroup.INGREDIENTS);
    public static final BarkItem BIRCH_BARK = registerItem("birch_bark", new Item.Settings(), BarkItem::new, StoneCutterItemGroup.INGREDIENTS);
    public static final BarkItem JUNGLE_BARK = registerItem("jungle_bark", new Item.Settings(), BarkItem::new, StoneCutterItemGroup.INGREDIENTS);
    public static final BarkItem ACACIA_BARK = registerItem("acacia_bark", new Item.Settings(), BarkItem::new, StoneCutterItemGroup.INGREDIENTS);
    public static final BarkItem DARK_OAK_BARK = registerItem("dark_oak_bark", new Item.Settings(), BarkItem::new, StoneCutterItemGroup.INGREDIENTS);
    public static final BarkItem MANGROVE_BARK = registerItem("mangrove_bark", new Item.Settings(), BarkItem::new, StoneCutterItemGroup.INGREDIENTS);
    //? if >=1.20 {
    public static final BarkItem CHERRY_BARK = registerItem("cherry_bark", new Item.Settings(), BarkItem::new, StoneCutterItemGroup.INGREDIENTS);
    //? if >=1.21.2 {
    public static final BarkItem PALE_OAK_BARK = registerItem("pale_oak_bark", new Item.Settings(), BarkItem::new, StoneCutterItemGroup.INGREDIENTS);
     //?}
    public static final BarkItem BAMBOO_BARK = registerItem("bamboo_bark", new Item.Settings(), BarkItem::new, StoneCutterItemGroup.INGREDIENTS);
    //?}
    public static final BarkItem CRIMSON_BARK = registerItem("crimson_bark", new Item.Settings(), BarkItem::new, StoneCutterItemGroup.INGREDIENTS);
    public static final BarkItem WARPED_BARK = registerItem("warped_bark", new Item.Settings(), BarkItem::new, StoneCutterItemGroup.INGREDIENTS);

    public static void register() {
        //OAK
        BarkRegistry.registerBarkItem(Blocks.OAK_LOG, Blocks.STRIPPED_OAK_LOG, OAK_BARK);
        BarkRegistry.registerBarkItem(Blocks.OAK_WOOD, Blocks.STRIPPED_OAK_WOOD, OAK_BARK);

        //SPRUCE
        BarkRegistry.registerBarkItem(Blocks.SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG, SPRUCE_BARK);
        BarkRegistry.registerBarkItem(Blocks.SPRUCE_WOOD, Blocks.STRIPPED_SPRUCE_WOOD, SPRUCE_BARK);

        //BIRCH
        BarkRegistry.registerBarkItem(Blocks.BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG, BIRCH_BARK);
        BarkRegistry.registerBarkItem(Blocks.BIRCH_WOOD, Blocks.STRIPPED_BIRCH_WOOD, BIRCH_BARK);

        //JUNGLE
        BarkRegistry.registerBarkItem(Blocks.JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG, JUNGLE_BARK);
        BarkRegistry.registerBarkItem(Blocks.JUNGLE_WOOD, Blocks.STRIPPED_JUNGLE_WOOD, JUNGLE_BARK);

        //ACACIA
        BarkRegistry.registerBarkItem(Blocks.ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG, ACACIA_BARK);
        BarkRegistry.registerBarkItem(Blocks.ACACIA_WOOD, Blocks.STRIPPED_ACACIA_WOOD, ACACIA_BARK);

        //DARK OAK
        BarkRegistry.registerBarkItem(Blocks.DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG, DARK_OAK_BARK);
        BarkRegistry.registerBarkItem(Blocks.DARK_OAK_WOOD, Blocks.STRIPPED_DARK_OAK_WOOD, DARK_OAK_BARK);


        //MANGROVE
        BarkRegistry.registerBarkItem(Blocks.MANGROVE_LOG, Blocks.STRIPPED_MANGROVE_LOG, MANGROVE_BARK);
        BarkRegistry.registerBarkItem(Blocks.MANGROVE_WOOD, Blocks.STRIPPED_MANGROVE_WOOD, MANGROVE_BARK);

        //? if >=1.20 {
        //CHERRY
        BarkRegistry.registerBarkItem(Blocks.CHERRY_LOG, Blocks.STRIPPED_CHERRY_LOG, CHERRY_BARK);
        BarkRegistry.registerBarkItem(Blocks.CHERRY_WOOD, Blocks.STRIPPED_CHERRY_WOOD, CHERRY_BARK);

        //? if >= 1.21.2 {
        //PALE OAK
        BarkRegistry.registerBarkItem(Blocks.PALE_OAK_LOG, Blocks.STRIPPED_PALE_OAK_LOG, PALE_OAK_BARK);
        BarkRegistry.registerBarkItem(Blocks.PALE_OAK_WOOD, Blocks.STRIPPED_PALE_OAK_WOOD, PALE_OAK_BARK);
        //?}

        //BAMBOO
        BarkRegistry.registerBarkItem(Blocks.BAMBOO_BLOCK, Blocks.STRIPPED_BAMBOO_BLOCK, BAMBOO_BARK);
        //?}

        //CRIMSON
        BarkRegistry.registerBarkItem(Blocks.CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_STEM, CRIMSON_BARK);
        BarkRegistry.registerBarkItem(Blocks.CRIMSON_HYPHAE, Blocks.STRIPPED_CRIMSON_HYPHAE, CRIMSON_BARK);

        //WARPED
        BarkRegistry.registerBarkItem(Blocks.WARPED_STEM, Blocks.STRIPPED_WARPED_STEM, WARPED_BARK);
        BarkRegistry.registerBarkItem(Blocks.WARPED_HYPHAE, Blocks.STRIPPED_WARPED_HYPHAE, WARPED_BARK);
    }

    protected static <T extends Item> T registerItem(String name, Item.Settings settings, Function<Item.Settings, T> itemFactory, StoneCutterItemGroup... groups) {
        return StoneCutterUtil.ItemUtils.registerWithGroup(Treebark.id(name), settings, itemFactory, groups);
    }
}
