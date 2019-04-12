package jp.co.navitime.j05.p06;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    private static final String[] EXPECTED = {
        "5+2=7",
        "5×2=10",
        "5-2=3",
        "5÷2=2.5",
    };

    private PrintStream stdout = System.out;
    private ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(out, true));
    }

    @After
    public void tearDown() {
        System.setOut(stdout);
    }

    @Test
    public void mainIsImplemented() {
        Main.main(new String[0]);
        String[] result = out.toString().split(System.lineSeparator());
        assertThat(result, is(EXPECTED));
    }
}
