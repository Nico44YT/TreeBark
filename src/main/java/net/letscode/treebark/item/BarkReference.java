package net.letscode.treebark.item;

import net.minecraft.resources.ResourceLocation;

import java.util.HashMap;

public class BarkReference {
    public HashMap<ResourceLocation, ResourceLocation> map;
    public String registryName;
    public BarkReference(HashMap<ResourceLocation, ResourceLocation> map, String registryName) {
        this.map = map;
        this.registryName = registryName;
    }
}

