package nazario.treebark.item;

import net.minecraft.util.Identifier;

import java.util.HashMap;

public class BarkReference {
    public HashMap<Identifier, Identifier> map;
    public Identifier registryName;
    public BarkReference(HashMap<Identifier, Identifier> map, Identifier registryName) {
        this.map = map;
        this.registryName = registryName;
    }
}
