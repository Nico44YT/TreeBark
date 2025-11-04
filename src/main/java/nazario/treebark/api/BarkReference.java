package nazario.treebark.api;

import nazario.treebark.item.custom.BarkItem;
import net.minecraft.block.Block;

public record BarkReference(Block logBlock, Block strippedBlock, BarkItem barkItem) {
}
