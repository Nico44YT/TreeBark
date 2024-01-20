package net.letscode.treebark.tag;

import net.letscode.treebark.TreeBark;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class TreeBarkTags {
    public static class Items {
        public static final TagKey<Item> BARK = tag("bark");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(TreeBark.MOD_ID, name));
        }
    }
}
