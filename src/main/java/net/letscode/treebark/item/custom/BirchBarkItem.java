package net.letscode.treebark.item.custom;

import net.letscode.treebark.item.BarkItem;
import net.minecraft.block.Blocks;

public class BirchBarkItem extends BarkItem {

    public BirchBarkItem(Settings settings) {
        super(settings);

        this.Log = Blocks.BIRCH_LOG;
        this.StrippedLog = Blocks.STRIPPED_BIRCH_LOG;

        this.WoodenLog = Blocks.BIRCH_WOOD;
        this.WoodenStrippedLog = Blocks.STRIPPED_BIRCH_WOOD;
    }
}