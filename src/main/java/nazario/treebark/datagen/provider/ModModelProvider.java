package nazario.treebark.datagen.provider;

import nazario.treebark.item.ModItems;

//? if >=1.21.4 {
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
//?} else if >=1.20 {
/*import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
*///?} else if >=1.19 {
/*import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
*///?}

public class ModModelProvider extends FabricModelProvider {

    //? if >=1.20 {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }
    //?} else {
    /*public ModModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }
    *///?}

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        ModItems.ALL.forEach(item -> {
            itemModelGenerator.register(item, Models.GENERATED);
        });
    }
}