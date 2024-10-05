package nazario.treebark.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

import java.util.HashMap;

public class BarkItem extends Item {
    public HashMap<Block, Block> barkMap;
    public BarkItem(Settings settings, HashMap<Block, Block> barkMap) {
        super(settings);
        this.barkMap = barkMap;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getWorld().isClient) return ActionResult.PASS;

        BlockState state = context.getWorld().getBlockState(context.getBlockPos());

        for(int i = 0; i < barkMap.size(); i++) {
            Block strippedBlock = (Block)barkMap.keySet().toArray()[i];
            Block logBlock = (Block)barkMap.values().toArray()[i];

            if(strippedBlock.equals(context.getWorld().getBlockState(context.getBlockPos()).getBlock())) {
                context.getWorld().setBlockState(context.getBlockPos(), logBlock.getStateWithProperties(state));
                context.getStack().decrementUnlessCreative(1, context.getPlayer());
                return ActionResult.SUCCESS;
            }
        }

        return ActionResult.FAIL;
    }
}
