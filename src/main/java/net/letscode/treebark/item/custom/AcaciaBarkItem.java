package net.letscode.treebark.item.custom;

import net.letscode.treebark.item.BarkItem;
import net.minecraft.block.Blocks;

public class AcaciaBarkItem extends BarkItem {

    public AcaciaBarkItem(Settings settings) {
        super(settings);

        this.Log = Blocks.ACACIA_LOG;
        this.StrippedLog = Blocks.STRIPPED_ACACIA_LOG;

        this.WoodenLog = Blocks.ACACIA_WOOD;
        this.WoodenStrippedLog = Blocks.STRIPPED_ACACIA_WOOD;
    }
}