package jp.co.navitime.j01.p04;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    private static final String[] EXPECTED = {
        "500円玉の枚数は1枚です",
        "100円玉の枚数は2枚です",
        "50円玉の枚数は1枚です",
        "10円玉の枚数は1枚です",
        "5円玉の枚数は1枚です",
        "1円玉の枚数は1枚です",
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
