package nazario.treebark.item.custom;

import nazario.treebark.TreebarkConstants;
import nazario.treebark.api.BarkReference;
import nazario.treebark.api.BarkRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import java.util.Optional;

public class BarkItem extends Item {

    public BarkItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        ActionResult result = useOnBlock(context.getPlayer(), context.getHand(), context.getWorld(), context.getBlockPos(), context.getWorld().getBlockState(context.getBlockPos()));
        return result == null ? super.useOnBlock(context) : result;
    }

    public ActionResult useOnBlock(PlayerEntity player, Hand hand, World world, BlockPos blockPos, BlockState strippedLogState) {
        ItemStack handStack = player.getStackInHand(hand);
        Optional<BarkReference> optional = BarkRegistry.get(reference -> {
                return reference.strippedBlock().equals(strippedLogState.getBlock()) &&
                        ((reference.barkItem().equals(handStack.getItem())) || !TreebarkConstants.BARK_EXCLUSIVE);
        });
        if(optional.isPresent()) {
            if(world.isClient()) return ActionResult.SUCCESS;

            world.playSound(null, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1, 0.4f);

            BlockState newState = optional.get().logBlock().getStateWithProperties(strippedLogState);
            //? if >=1.21 {
            world.setBlockState(blockPos, newState, Block.NOTIFY_ALL_AND_REDRAW);
            //?} else {
            /*world.setBlockState(blockPos, newState, Block.NOTIFY_LISTENERS);
            *///?}
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Emitter.of(player, newState));

            handStack.decrement(1);

            //? if >=1.21.2 {
            return ActionResult.SUCCESS_SERVER;
            //?} else {
            /*return ActionResult.SUCCESS;
            *///?}
        }

        return null;
    }
}
