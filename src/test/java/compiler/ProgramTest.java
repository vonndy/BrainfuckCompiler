package compiler;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProgramTest {
    private Program program;
    private String helloWorld, helloWorldWithLoops, expected = "Hello World!\n";

    @Before
    public void setUp() throws Exception {
        program = new Program();
        helloWorld = "+++++++++++++++++++++++++++++++++++++++++++++" +
                " +++++++++++++++++++++++++++.+++++++++++++++++" +
                " ++++++++++++.+++++++..+++.-------------------" +
                " ---------------------------------------------" +
                " ---------------.+++++++++++++++++++++++++++++" +
                " ++++++++++++++++++++++++++.++++++++++++++++++" +
                " ++++++.+++.------.--------.------------------" +
                " ---------------------------------------------" +
                " ----.-----------------------.";
        helloWorldWithLoops = ">++++++++[-<+++++++++>]<.>>+>-[+]++>++>+++[>[->+++<<+++>]<<]>-----.>->" +
                "+++..+++.>-.<<+[>[+>+]>>]<--------------.>>.+++.------.--------.>+.>+.";
    }

    @Test
    public void runHelloWorld() {
        Assert.assertEquals(expected, program.run(helloWorld));
    }

    @Test
    public void runHelloWorldWithLoops() {
        Assert.assertEquals(expected, program.run(helloWorldWithLoops));
    }
}