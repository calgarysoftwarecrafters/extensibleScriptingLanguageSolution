package ideajoy.intscript;

public class CompositionLoader implements OpLoader {
    private OpLoader otherOpLoader;

    public CompositionLoader(OpLoader loader){
        otherOpLoader = loader;
    }

    @Override
    public Op loadOp(String name) {
        switch (name) {
            case "Mul":
                return new Mul();
            case "Div":
                return new Div();
            default:
                return otherOpLoader.loadOp(name);
        }
    }
}
