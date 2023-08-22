package net.letscode.treebark.item.custom;

import net.letscode.treebark.item.BarkItem;
import net.minecraft.block.Blocks;

public class SpruceBarkItem extends BarkItem {

    public SpruceBarkItem(Settings settings) {
        super(settings);

        this.Log = Blocks.SPRUCE_LOG;
        this.StrippedLog = Blocks.STRIPPED_SPRUCE_LOG;

        this.WoodenLog = Blocks.SPRUCE_WOOD;
        this.WoodenStrippedLog = Blocks.STRIPPED_SPRUCE_WOOD;
    }

}