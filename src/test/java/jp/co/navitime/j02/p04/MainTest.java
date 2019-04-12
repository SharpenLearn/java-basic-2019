package jp.co.navitime.j02.p04;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    private static final String[] EXPECTED = {
        "0",
        "1",
        "1",
        "2",
        "3",
        "5",
        "8",
        "13",
        "21",
        "34",
        "55",
        "89",
        "144",
        "233",
        "377",
        "610",
        "987",
        "1597",
        "2584",
        "4181",
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
    public void testProblem() {
        Main.main(new String[0]);

        String[] result = out.toString().split(System.lineSeparator());

        assertThat(result, is(EXPECTED));
    }
}
