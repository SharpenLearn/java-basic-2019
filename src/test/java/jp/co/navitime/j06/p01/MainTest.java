package jp.co.navitime.j06.p01;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    private PrintStream stderr = System.err;
    private ByteArrayOutputStream err = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setErr(new PrintStream(err, true));
    }

    @After
    public void tearDown() {
        System.setErr(stderr);
    }

    @Test
    public void testProblem() {
        Main.main(new String[0]);

        assertThat(err.toString(), containsString("/ by zero"));
    }
}
