package nazario.treebark.mixin;

import nazario.treebark.api.BarkRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(AxeItem.class)
public abstract class AxeItemMixin {

    //? if >=1.21 {
    @Inject(method = "tryStrip", at = @At(value = "INVOKE", target = "Ljava/util/Optional;isPresent()Z", shift = At.Shift.AFTER, ordinal = 0))
    public void treebark$tryStrip(World world, BlockPos blockPos, PlayerEntity player, BlockState state, CallbackInfoReturnable<Optional<BlockState>> cir) {
    //?} else {
    /*@Inject(method = "useOnBlock", at = @At(value = "INVOKE", target = "Ljava/util/Optional;isPresent()Z", shift = At.Shift.AFTER, ordinal = 0))
    public void treebark(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir) {
        World world = context.getWorld();
        BlockState state = context.getWorld().getBlockState(context.getBlockPos());
        PlayerEntity player = context.getPlayer();
    *///?}

        BarkRegistry.getFromLog(state.getBlock()).ifPresent(reference -> {
            if(world.isClient()) return;

            ItemEntity itemEntity = new ItemEntity(EntityType.ITEM, world);

            if(player != null) itemEntity.setPosition(player.raycast(8 /* <-- TODO get player reach/interact distance */, 0, false).getPos());

            itemEntity.setStack(reference.barkItem().getDefaultStack());

            world.spawnEntity(itemEntity);
        });
    }
}