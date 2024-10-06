package nazario.treebark.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.registry.Registries;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;

public class BarkItem extends Item {
    public BarkReference reference;
    public BarkItem(Settings settings, BarkReference reference) {
        super(settings);
        this.reference = reference;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getWorld().isClient) return ActionResult.PASS;

        BlockState state = context.getWorld().getBlockState(context.getBlockPos());

        for(int i = 0; i < reference.map.size(); i++) {
            Block strippedBlock = Registries.BLOCK.get((Identifier)reference.map.keySet().toArray()[i]);
            Block logBlock = Registries.BLOCK.get((Identifier)reference.map.values().toArray()[i]);

            if(strippedBlock.equals(context.getWorld().getBlockState(context.getBlockPos()).getBlock())) {
                context.getWorld().setBlockState(context.getBlockPos(), logBlock.getStateWithProperties(state));
                context.getStack().decrementUnlessCreative(1, context.getPlayer());
                return ActionResult.SUCCESS;
            }
        }

        return ActionResult.FAIL;
    }
}