package net.letscode.treebark.datagen;

import net.letscode.treebark.item.ModItems;
import net.letscode.treebark.tag.TreeBarkTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

public class TBItemTagsProvider extends ItemTagsProvider {


    public TBItemTagsProvider(DataGenerator pGenerator, BlockTagsProvider pBlockTagsProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(pGenerator, pBlockTagsProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
            this.tag(TreeBarkTags.Items.BARK).add(item.get().asItem());
        }
    }
}
