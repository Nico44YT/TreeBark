package nazario.treebark.datagen;

import nazario.treebark.datagen.provider.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class TreebarkDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        //? if >=1.20 {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModModelProvider::new);
        //?} else {
        /*fabricDataGenerator.addProvider(ModModelProvider::new);
        *///?}
    }
}
