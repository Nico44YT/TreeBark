package net.letscode.treebark.item.custom;

import net.letscode.treebark.item.BarkItem;
import net.letscode.treebark.item.ModItemGroup;
import net.minecraft.block.Blocks;

public class WarpedBarkItem extends BarkItem {

    public WarpedBarkItem(Settings settings) {
        super(settings.group(ModItemGroup.TREEBARK));

        this.Log = Blocks.WARPED_STEM;
        this.StrippedLog = Blocks.STRIPPED_WARPED_STEM;

        this.WoodenLog = Blocks.WARPED_HYPHAE;
        this.WoodenStrippedLog = Blocks.STRIPPED_WARPED_HYPHAE;
    }
}
