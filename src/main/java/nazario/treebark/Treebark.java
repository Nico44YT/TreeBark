package nazario.treebark;

import nazario.treebark.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class Treebark implements ModInitializer {

    public static final String MOD_ID = "treebark";

    @Override
    public void onInitialize() {
        ModItems.register();
    }

    public static Identifier id(String name) {
        return Identifier.of(MOD_ID, name);
    }
}
