package jp.co.navitime.j01.p03;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

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

        double result = Double.valueOf(out.toString());

        assertThat(result, closeTo(7.6812023809523815, 1.0e-6));
    }
}
