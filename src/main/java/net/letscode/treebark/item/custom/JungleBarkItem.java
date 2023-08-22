package net.letscode.treebark.item.custom;

import net.letscode.treebark.item.BarkItem;
import net.minecraft.block.Blocks;

public class JungleBarkItem extends BarkItem {

    public JungleBarkItem(Settings settings) {
        super(settings);

        this.Log = Blocks.JUNGLE_LOG;
        this.StrippedLog = Blocks.STRIPPED_JUNGLE_LOG;

        this.WoodenLog = Blocks.JUNGLE_WOOD;
        this.WoodenStrippedLog = Blocks.STRIPPED_JUNGLE_WOOD;
    }
}