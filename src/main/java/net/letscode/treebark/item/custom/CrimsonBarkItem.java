package net.letscode.treebark.item.custom;

import net.letscode.treebark.item.BarkItem;
import net.letscode.treebark.item.ModItemGroup;
import net.minecraft.block.Blocks;

public class CrimsonBarkItem extends BarkItem {

    public CrimsonBarkItem(Settings settings) {
        super(settings.group(ModItemGroup.TREEBARK));

        this.Log = Blocks.CRIMSON_STEM;
        this.StrippedLog = Blocks.STRIPPED_CRIMSON_STEM;

        this.WoodenLog = Blocks.CRIMSON_HYPHAE;
        this.WoodenStrippedLog = Blocks.STRIPPED_CRIMSON_HYPHAE;
    }
}
