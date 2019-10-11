package ideajoy.intscript;

public class ExtendsOpLoader extends SwitchLoader{
    @Override
    public  Op loadOp(String name){
        switch (name){
            case "Mul": return new Mul();
            case "Div": return new Div();
            default: return super.loadOp(name);
        }
    }
}
