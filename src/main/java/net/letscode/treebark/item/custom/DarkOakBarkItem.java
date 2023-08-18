package net.letscode.treebark.item.custom;

import net.letscode.treebark.item.BarkItem;
import net.letscode.treebark.item.ModItemGroup;
import net.minecraft.block.Blocks;

public class DarkOakBarkItem extends BarkItem {

    public DarkOakBarkItem(Settings settings) {
        super(settings.group(ModItemGroup.TREEBARK));

        this.Log = Blocks.DARK_OAK_LOG;
        this.StrippedLog = Blocks.STRIPPED_DARK_OAK_LOG;

        this.WoodenLog = Blocks.DARK_OAK_WOOD;
        this.WoodenStrippedLog = Blocks.STRIPPED_DARK_OAK_WOOD;
    }
}
