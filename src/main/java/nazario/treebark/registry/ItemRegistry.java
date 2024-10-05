package nazario.treebark.registry;

import nazario.liby.item.LibyItemGroup;
import nazario.liby.registry.auto.LibyAutoRegister;
import nazario.liby.registry.helper.LibyItemGroupRegister;
import nazario.liby.registry.helper.LibyItemRegister;
import nazario.treebark.Treebark;
import nazario.treebark.item.BarkItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.List;

@LibyAutoRegister(priority = 1, register = "registerItems")
public class ItemRegistry {
    public static final LibyItemRegister REGISTER = new LibyItemRegister(Treebark.MOD_ID);
    public static final LibyItemGroupRegister ITEM_GROUP_REGISTER = new LibyItemGroupRegister(Treebark.MOD_ID);

    public static final LibyItemGroup ITEM_GROUP = new LibyItemGroup("bark_tab", FabricItemGroup.builder());

    public static final Item ACACIA_BARK = REGISTER.registerItem("acacia_bark", new BarkItem(new Item.Settings(), BarkTypeRegistry.ACACIA_BLOCKS));
    public static final Item BAMBOO_BARK = REGISTER.registerItem("bamboo_bark", new BarkItem(new Item.Settings(), BarkTypeRegistry.BAMBOO_BLOCKS));
    public static final Item BIRCH_BARK = REGISTER.registerItem("birch_bark", new BarkItem(new Item.Settings(), BarkTypeRegistry.BIRCH_BLOCKS));
    public static final Item CRIMSON_BARK = REGISTER.registerItem("crimson_bark", new BarkItem(new Item.Settings(), BarkTypeRegistry.CRIMSON_BLOCKS));
    public static final Item CHERRY_BARK = REGISTER.registerItem("cherry_bark", new BarkItem(new Item.Settings(), BarkTypeRegistry.CHERRY_BLOCKS));
    public static final Item DARK_OAK_BARK = REGISTER.registerItem("dark_oak_bark", new BarkItem(new Item.Settings(), BarkTypeRegistry.DARK_OAK_BLOCKS));
    public static final Item JUNGLE_BARK = REGISTER.registerItem("jungle_bark", new BarkItem(new Item.Settings(), BarkTypeRegistry.JUNGLE_BLOCKS));
    public static final Item MANGROVE_BARK = REGISTER.registerItem("mangrove_bark", new BarkItem(new Item.Settings(), BarkTypeRegistry.MANGROVE_BLOCKS));
    public static final Item OAK_BARK = REGISTER.registerItem("oak_bark", new BarkItem(new Item.Settings(), BarkTypeRegistry.OAK_BLOCKS));
    public static final Item SPRUCE_BARK = REGISTER.registerItem("spruce_bark", new BarkItem(new Item.Settings(), BarkTypeRegistry.SPRUCE_BLOCKS));
    public static final Item WARPED_BARK = REGISTER.registerItem("warped_bark", new BarkItem(new Item.Settings(), BarkTypeRegistry.WARPED_BLOCKS));

    public static final List<Item> BARK_LIST = new ArrayList<>();

    public static void registerItems() {
        addBark(ACACIA_BARK, BAMBOO_BARK, BIRCH_BARK, CRIMSON_BARK, CHERRY_BARK, DARK_OAK_BARK, JUNGLE_BARK, MANGROVE_BARK, OAK_BARK, SPRUCE_BARK, WARPED_BARK);

        BARK_LIST.forEach(ITEM_GROUP::addItem);

        ITEM_GROUP.builder.icon(() -> new ItemStack(OAK_BARK));
        ITEM_GROUP.builder.displayName(Text.translatable("itemGroup.treebark.bark_tab"));

        ITEM_GROUP_REGISTER.registerItemGroup(ITEM_GROUP);
    }

    public static void addBark(Item... items) {
        BARK_LIST.addAll(List.of(items));
    }
}
