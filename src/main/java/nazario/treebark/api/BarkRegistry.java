package nazario.treebark.api;

import nazario.stonecutterutil.StoneCutterUtil;
import nazario.treebark.item.custom.BarkItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class BarkRegistry {

    protected static final List<BarkReference> referenceList = new ArrayList<>();

    public static <T extends BarkItem> T registerBarkItem(Block logBlock, Block strippedBlock, String name, Function<String, Identifier> idFunction) {
        return registerBarkItem(logBlock, strippedBlock, idFunction.apply(name));
    }

    public static <T extends BarkItem> T registerBarkItem(Block logBlock, Block strippedBlock, Identifier id) {

        T item;
        if(StoneCutterUtil.ItemUtils.isRegistered(id)) {
            item = (T) StoneCutterUtil.ItemUtils.getById(id);
        } else {
            item = (T) StoneCutterUtil.ItemUtils.register(id, new Item.Settings(), BarkItem::new);
        }

        return registerBarkItem(logBlock, strippedBlock, item);
    }

    public static <T extends BarkItem> T registerBarkItem(Block logBlock, Block strippedBlock, T barkItem) {
        referenceList.add(new BarkReference(logBlock, strippedBlock, barkItem));
        return barkItem;
    }

    public static Optional<BarkReference> getFromLog(Block logBlock) {
        return get(reference -> reference.logBlock().equals(logBlock));
    }

    public static Optional<BarkReference> getFromStripped(Block strippedBlock) {
        return get(reference -> reference.strippedBlock().equals(strippedBlock));
    }

    public static Optional<BarkReference> get(Predicate<BarkReference> predicate) {
        return referenceList.stream().filter(predicate).findFirst();
    }

    @Deprecated
    public static List<BarkReference> getReferences() {
        return referenceList;
    }
}
