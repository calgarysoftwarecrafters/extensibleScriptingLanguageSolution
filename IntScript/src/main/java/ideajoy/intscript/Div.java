package ideajoy.intscript;

import ideajoy.intscript.Op;

public class Div implements Op {
    @Override
    public int doOp(int n1, int n2) {
        return n1/n2;
    }
}
