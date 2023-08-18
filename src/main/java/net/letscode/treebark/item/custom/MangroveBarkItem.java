package net.letscode.treebark.item.custom;

import net.letscode.treebark.item.BarkItem;
import net.letscode.treebark.item.ModItemGroup;
import net.minecraft.block.Blocks;

public class MangroveBarkItem extends BarkItem {

    public MangroveBarkItem(Settings settings) {
        super(settings.group(ModItemGroup.TREEBARK));

        this.Log = Blocks.MANGROVE_LOG;
        this.StrippedLog = Blocks.STRIPPED_MANGROVE_LOG;

        this.WoodenLog = Blocks.MANGROVE_WOOD;
        this.WoodenStrippedLog = Blocks.STRIPPED_MANGROVE_WOOD;
    }
}
