package nazario.treebark.mixin;

import nazario.treebark.item.BarkItem;
import nazario.treebark.registry.ItemRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(AxeItem.class)
public abstract class AxeItemMixin {
    @Inject(method = "tryStrip", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;playSound(Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/sound/SoundEvent;Lnet/minecraft/sound/SoundCategory;FF)V", ordinal = 0))
    public void treebark$tryStrip(World world, BlockPos pos, PlayerEntity player, BlockState state, CallbackInfoReturnable<Optional<BlockState>> cir) {
        if(world.isClient) return;

        ItemEntity itemEntity = new ItemEntity(EntityType.ITEM, world);

        if(player != null) itemEntity.setPosition(player.raycast(8, 0, false).getPos());
        if(player != null || itemEntity.getPos() == null) itemEntity.setPosition(pos.toCenterPos());

        for(Item item : ItemRegistry.itemMap.values()) {
            if(item instanceof BarkItem barkItem) {
                for(Identifier identifier : barkItem.reference.map.values()) {
                    if(Registries.BLOCK.get(identifier).equals(state.getBlock())) {
                        itemEntity.setStack(new ItemStack(barkItem));
                        break;
                    }
                }
            }
        }

        world.spawnEntity(itemEntity);
    }
}
