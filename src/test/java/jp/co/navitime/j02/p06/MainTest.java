package jp.co.navitime.j02.p06;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    private static final String[] EXPECTED = {
        "1",
        "2",
        "3 アホになる",
        "4",
        "5",
        "6 アホになる",
        "7",
        "8",
        "9 アホになる",
        "10",
        "11",
        "12 アホになる",
        "13 アホになる",
        "14",
        "15 アホになる",
        "16",
        "17",
        "18 アホになる",
        "19",
        "20",
        "21 アホになる",
        "22",
        "23 アホになる",
        "24 アホになる",
        "25",
        "26",
        "27 アホになる",
        "28",
        "29",
        "30 アホになる",
        "31 アホになる",
        "32 アホになる",
        "33 アホになる",
        "34 アホになる",
        "35 アホになる",
        "36 アホになる",
        "37 アホになる",
        "38 アホになる",
        "39 アホになる",
        "40",
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
