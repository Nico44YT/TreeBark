package nazario.treebark.registry;

import nazario.liby.registry.auto.LibyAutoRegister;
import nazario.liby.registry.helper.LibyItemRegister;
import nazario.treebark.Treebark;
import nazario.treebark.item.BarkItem;
import nazario.treebark.item.BarkReference;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.HashMap;

@LibyAutoRegister(priority = 10)
public class ItemRegistry {
    public static LibyItemRegister REGISTER = new LibyItemRegister(Treebark.MOD_ID);

    public static HashMap<Identifier, Item> itemMap = new HashMap<>();

    public static void register() {
        for(int i = 0; i < BarkRegistry.references.size(); i++) {
            BarkReference reference = BarkRegistry.references.get(i);

            Item item = Registry.register(Registries.ITEM, reference.registryName, new BarkItem(new Item.Settings(), reference));

            for(Identifier identifier : reference.map.values()) {
                itemMap.put(identifier, item);
            }
        }
    }
}
