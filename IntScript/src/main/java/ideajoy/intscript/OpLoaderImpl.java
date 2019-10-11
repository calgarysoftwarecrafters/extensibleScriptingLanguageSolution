package ideajoy.intscript;

public class OpLoaderImpl implements OpLoader{

    @Override
    public Op loadOp(String name) {
        try {
            return (Op)Class.forName("ideajoy.intscript." +name ).newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e) {
            throw new UnsupportedOperationException(e);
        }
    }
}
