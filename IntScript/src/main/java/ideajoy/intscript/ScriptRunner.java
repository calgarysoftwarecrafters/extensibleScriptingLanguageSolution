package ideajoy.intscript;

import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ScriptRunner {
    private int state =0;
    private OpLoader opLoader;


    public ScriptRunner(OpLoader opLoader){
        this.opLoader = opLoader;
    }

    public int runLine(String line){
        String[] parts = line.split(" ");
        Op op = opLoader.loadOp(parts[0]);
        state = op.doOp(state,Integer.parseInt(parts[1]));
        return state;
    }


    public int run(File f) {
        Stream<String> stream = createStream(f);
        stream.forEach(this::runLine);
        return state;
    }

    private Stream<String> createStream(File f) {
        try{
            return Files.lines(Paths.get(f.getAbsolutePath()));
        }
        catch (IOException ex){
            throw new RuntimeException(ex);
        }
    }
}
