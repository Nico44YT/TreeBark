package nazario.treebark;

import nazario.liby.registry.auto.LibyRegistryLoader;
import net.fabricmc.api.ModInitializer;

public class Treebark implements ModInitializer {

    public static final String MOD_ID = "treebark";

    @Override
    public void onInitialize() {
        LibyRegistryLoader.load("nazario.treebark.registry");
    }
}
