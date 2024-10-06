package nazario.treebark.registry;

import nazario.liby.item.LibyItemGroup;
import nazario.liby.registry.auto.LibyAutoRegister;
import nazario.liby.registry.helper.LibyItemGroupRegister;
import nazario.treebark.Treebark;
import nazario.treebark.item.BarkReference;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

@LibyAutoRegister(priority = 20)
public class ItemGroupRegistry {
    public static final LibyItemGroupRegister ITEM_GROUP_REGISTER = new LibyItemGroupRegister(Treebark.MOD_ID);

    public static final LibyItemGroup ITEM_GROUP = new LibyItemGroup("bark_tab", FabricItemGroup.builder());

    public static void register() {
        //BarkRegistry.references.forEach((barkReference) -> ITEM_GROUP.addItemStack(new ItemStack(Registries.ITEM.get(barkReference.registryName))));

        for(BarkReference reference : BarkRegistry.references) {
            ITEM_GROUP.addItemStack(new ItemStack(Registries.ITEM.get(reference.registryName)));
        }

        ITEM_GROUP.builder.icon(() -> new ItemStack(Registries.ITEM.get(Identifier.of("treebark","oak_bark"))));
        ITEM_GROUP.builder.displayName(Text.translatable("itemGroup.treebark.bark_tab"));

        ITEM_GROUP_REGISTER.registerItemGroup(ITEM_GROUP);
    }
}
