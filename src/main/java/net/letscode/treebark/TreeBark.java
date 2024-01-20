package net.letscode.treebark;

import com.mojang.logging.LogUtils;
import net.letscode.treebark.item.TBItems;
import net.letscode.treebark.registries.BarkRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(TreeBark.MOD_ID)
public class TreeBark {
    public static final String MOD_ID = "treebark";

    public TreeBark() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BarkRegistry.register();

        TBItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }
}
