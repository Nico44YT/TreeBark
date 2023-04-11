package com.letscode.item;

import com.letscode.TreeBark;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup TREEBARK = FabricItemGroupBuilder.build(
            new Identifier(TreeBark.MOD_ID, "bark_tab"), () -> new ItemStack(ModItems.OAK_BARK)
    );
}
