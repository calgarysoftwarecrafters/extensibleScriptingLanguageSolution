package ideajoy.intscript;

import java.util.HashMap;
import java.util.Map;

public class RegistryLoader implements OpLoader{
    private Map<String, Op> ops = new HashMap<>();


    @Override
    public Op loadOp(String name) {
        if(!ops.containsKey(name)){
            throw new UnsupportedOperationException(name);
        }
        return ops.get(name);
    }

    public void register(String name, Op op){
        ops.put(name,op);
    }
}
