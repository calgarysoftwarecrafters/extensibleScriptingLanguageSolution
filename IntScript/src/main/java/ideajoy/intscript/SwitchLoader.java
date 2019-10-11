package ideajoy.intscript;

public class SwitchLoader implements OpLoader {
    @Override
    public Op loadOp(String name) {
        switch (name){
            case "Add": return new Add();
            case "Sub": return new Sub();
            default: throw new UnsupportedOperationException(name);
        }
    }
}
