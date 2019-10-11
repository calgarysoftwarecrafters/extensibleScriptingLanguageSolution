package ideajoy.intscipt;

import ideajoy.intscript.*;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;


public class ScriptRunnerTests {

    private ScriptRunner runner;

    @Before
    public void init(){
        //OpLoader opLoader = new SwitchLoader();
        //OpLoader opLoader = new ExtendsOpLoader();

//        RegistryLoader opLoader = new RegistryLoader();
//        opLoader.register("Add", new Add());
//        opLoader.register("Sub", new Sub());
//        opLoader.register("Mul", new Mul());
//        opLoader.register("Div", new Div());

        OpLoader opLoader = new OpLoaderImpl();
        //OpLoader opLoader = new CompositionLoader(new SwitchLoader());
        //OpLoader opLoader = new CacheLoader(new OpLoaderImpl());
        runner = new ScriptRunner(opLoader); //this will lead to NPEs
    }

    @Test
    public void addOne(){
        String line = "Add 1";
        assertEquals(1,runner.runLine(line));
    }

    @Test
    public void addOneSubTwo(){
        String line = "Add 1";
        assertEquals(1,runner.runLine(line));
        line = "Sub 2";
        assertEquals(-1,runner.runLine(line));
    }

    @Test
    public void script(){
        File f = new File("test.is.txt");
        assertEquals(-3,runner.run(f));
    }

    @Test
    public void mulThree(){
        String line = "Add 2";
        runner.runLine(line);

        line = "Mul 3";
        assertEquals(6, runner.runLine(line));

    }

    @Test
    public void divFive(){
        String line = "Add 10";
        runner.runLine(line);

        line = "Div 5";
        assertEquals(2, runner.runLine(line));
    }



}
