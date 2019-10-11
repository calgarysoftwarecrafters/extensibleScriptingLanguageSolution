package ideajoy.intscript;

import java.util.HashMap;
import java.util.Map;

public class CacheLoader implements OpLoader {

    private final OpLoader opLoader;
    private Map<String, Op> ops;

    public CacheLoader(OpLoader opLoader){
        this.opLoader = opLoader;
        this.ops = new HashMap<>();
    }

    @Override
    public Op loadOp(String name) {
        if(ops.containsKey(name)){
            return ops.get(name);
        }

        Op op = opLoader.loadOp(name);
        ops.put(name, op);
        return op;
    }
}
