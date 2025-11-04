package nazario.stonecutterutil;

//? if >=1.21 {
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
//?} else if >=1.20 {
/*import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
*///?} else if >=1.19 {
/*import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
*///?}

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;

public class StoneCutterUtil {
    public static class ItemUtils {
        public static boolean isRegistered(Identifier identifier) {
            //? if >=1.20 {
            return Registries.ITEM.containsId(identifier);
            //?} else if >=1.19 {
            /*return Registry.ITEM.containsId(identifier);
            *///?}
        }

        public static Item getById(Identifier identifier) {
            //? if >=1.20 {
            return Registries.ITEM.get(identifier);
            //?} else if >=1.19 {
            /*return Registry.ITEM.get(identifier);
            *///?}
        }

        public static <T extends Item> T registerWithGroup(Identifier id, Item.Settings settings, Function<Item.Settings, T> itemFactory, StoneCutterItemGroup... groups) {
            //? if >=1.20 {
            T item = register(id, settings, itemFactory);
            for(StoneCutterItemGroup stoneCutterGroup : groups) {
                ItemGroupEvents.modifyEntriesEvent(stoneCutterGroup.itemGroup()).register(t -> t.add(item));
            }

            return item;
            //?} else if >=1.19 {
            /*if(groups.length > 0) {
                Optional<ItemGroup> optional = Arrays.stream(ItemGroup.GROUPS).filter($ -> $.equals(groups[0].itemGroup())).findAny();
                optional.ifPresent(settings::group);
            }
            return register(id, settings, itemFactory);
            *///?}
        }

        public static <T extends Item> T register(Identifier id, Item.Settings settings, Function<Item.Settings, T> itemFactory) {
            //? if >=1.21.2 {
            RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, id);
            T item = Registry.register(Registries.ITEM, id, itemFactory.apply(settings.registryKey(itemKey)));
            //?} else if >=1.20 {
            /*T item = Registry.register(Registries.ITEM, id, itemFactory.apply(settings));
             *///?} else if >=1.19 {
            /*T item = Registry.register(Registry.ITEM, id, itemFactory.apply(settings));
            *///?}

            return item;
        }
    }
}
