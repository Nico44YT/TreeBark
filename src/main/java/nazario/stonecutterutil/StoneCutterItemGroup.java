package nazario.stonecutterutil;

//? if >=1.20 {
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKey;
//?} else {
/*import net.minecraft.item.ItemGroup;
*///?}


//? if >=1.20 {
public record StoneCutterItemGroup(RegistryKey<ItemGroup> itemGroup) {
    public static final StoneCutterItemGroup BUILDING_BLOCKS = new StoneCutterItemGroup(ItemGroups.BUILDING_BLOCKS);
    public static final StoneCutterItemGroup COLORED_BLOCKS = new StoneCutterItemGroup(ItemGroups.COLORED_BLOCKS);
    public static final StoneCutterItemGroup NATURAL = new StoneCutterItemGroup(ItemGroups.NATURAL);
    public static final StoneCutterItemGroup FUNCTIONAL = new StoneCutterItemGroup(ItemGroups.FUNCTIONAL);
    public static final StoneCutterItemGroup REDSTONE = new StoneCutterItemGroup(ItemGroups.REDSTONE);
    public static final StoneCutterItemGroup HOTBAR = new StoneCutterItemGroup(ItemGroups.HOTBAR);
    public static final StoneCutterItemGroup SEARCH = new StoneCutterItemGroup(ItemGroups.SEARCH);
    public static final StoneCutterItemGroup TOOLS = new StoneCutterItemGroup(ItemGroups.TOOLS);
    public static final StoneCutterItemGroup COMBAT = new StoneCutterItemGroup(ItemGroups.COMBAT);
    public static final StoneCutterItemGroup FOOD_AND_DRINK = new StoneCutterItemGroup(ItemGroups.FOOD_AND_DRINK);
    public static final StoneCutterItemGroup INGREDIENTS = new StoneCutterItemGroup(ItemGroups.INGREDIENTS);
    public static final StoneCutterItemGroup SPAWN_EGGS = new StoneCutterItemGroup(ItemGroups.SPAWN_EGGS);
    public static final StoneCutterItemGroup OPERATOR = new StoneCutterItemGroup(ItemGroups.OPERATOR);
    public static final StoneCutterItemGroup INVENTORY = new StoneCutterItemGroup(ItemGroups.INVENTORY);
}
//?} else if >=1.19 {
/*public record StoneCutterItemGroup(ItemGroup itemGroup) {
    public static final StoneCutterItemGroup BUILDING_BLOCKS = new StoneCutterItemGroup(ItemGroup.BUILDING_BLOCKS);
    public static final StoneCutterItemGroup COLORED_BLOCKS = BUILDING_BLOCKS;
    public static final StoneCutterItemGroup NATURAL = BUILDING_BLOCKS;
    public static final StoneCutterItemGroup FUNCTIONAL = new StoneCutterItemGroup(ItemGroup.DECORATIONS);
    public static final StoneCutterItemGroup REDSTONE = new StoneCutterItemGroup(ItemGroup.REDSTONE);
    public static final StoneCutterItemGroup HOTBAR = new StoneCutterItemGroup(ItemGroup.HOTBAR);
    public static final StoneCutterItemGroup SEARCH = new StoneCutterItemGroup(ItemGroup.SEARCH);
    public static final StoneCutterItemGroup TOOLS = new StoneCutterItemGroup(ItemGroup.TOOLS);
    public static final StoneCutterItemGroup COMBAT = new StoneCutterItemGroup(ItemGroup.COMBAT);
    public static final StoneCutterItemGroup FOOD_AND_DRINK = new StoneCutterItemGroup(ItemGroup.FOOD);
    public static final StoneCutterItemGroup INGREDIENTS = new StoneCutterItemGroup(ItemGroup.MATERIALS);
    public static final StoneCutterItemGroup SPAWN_EGGS = new StoneCutterItemGroup(ItemGroup.MISC);
    public static final StoneCutterItemGroup OPERATOR = new StoneCutterItemGroup(ItemGroup.SEARCH);
    public static final StoneCutterItemGroup INVENTORY = new StoneCutterItemGroup(ItemGroup.INVENTORY);
}
*///?}

