package net.letscode.treebark.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.letscode.treebark.TreeBark;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static ItemGroup TREEBARK;

    public static void registerItemGroup() {
        TREEBARK = FabricItemGroup.builder(new Identifier(TreeBark.MOD_ID, "bark_tab"))
                .displayName(Text.translatable("itemGroup.treebark.bark_tab"))
                .icon(() -> new ItemStack(ModItems.OAK_BARK)).build();
    }
}
