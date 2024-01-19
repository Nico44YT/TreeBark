package net.letscode.treebark.item;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import java.util.HashMap;
import java.util.List;

public class BarkReference {
    public HashMap<ResourceLocation, ResourceLocation> map;
    public String registryName;
    public BarkReference(HashMap<ResourceLocation, ResourceLocation> map, String registryName) {
        this.map = map;
        this.registryName = registryName;
    }
}

