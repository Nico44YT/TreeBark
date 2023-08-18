package net.letscode.treebark.item.custom;

import net.letscode.treebark.item.BarkItem;
import net.letscode.treebark.item.ModItemGroup;
import net.minecraft.block.Blocks;

public class OakBarkItem extends BarkItem {

    public OakBarkItem(Settings settings) {
        super(settings.group(ModItemGroup.TREEBARK));

        this.Log = Blocks.OAK_LOG;
        this.StrippedLog = Blocks.STRIPPED_OAK_LOG;

        this.WoodenLog = Blocks.OAK_WOOD;
        this.WoodenStrippedLog = Blocks.STRIPPED_OAK_WOOD;
    }
}
