package net.letscode.treebark.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.letscode.treebark.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ACACIA_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIRCH_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRIMSON_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_OAK_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.JUNGLE_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANGROVE_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.OAK_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPRUCE_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARPED_BARK, Models.GENERATED);

    }
}
