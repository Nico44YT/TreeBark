package net.letscode.treebark.datagen;

import net.letscode.treebark.TreeBark;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TreeBark.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();

        ExistingFileHelper efh = event.getExistingFileHelper();

        gen.addProvider(event.includeServer(), new TBItemTagsProvider(gen, new TBBlockTagsProvider(gen, TreeBark.MOD_ID, efh), TreeBark.MOD_ID, efh));
    }
}
