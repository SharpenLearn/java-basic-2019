package jp.co.navitime.j01.p06;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MainTest {

    private static final double ERROR = 1.0e-6;

    private PrintStream stdout = System.out;
    private ByteArrayOutputStream out = new ByteArrayOutputStream();

    private int base;
    private int height;
    private double area;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                {10, 20, 100},
                {3, 5, 7.5},
                {5, 7, 17.5},
        });
    }

    public MainTest(int base, int height, double area) {
        this.base = base;
        this.height = height;
        this.area = area;
    }

    @Before
    public void setUp() {
        System.setOut(new PrintStream(out, true));
    }

    @After
    public void tearDown() {
        System.setOut(stdout);
    }

    @Test
    public void printTriangleAreaIsDefined() throws ReflectiveOperationException {
        Method method = Main.class.getDeclaredMethod(
                "printTriangleArea", int.class, int.class);

        method.setAccessible(true);
        method.invoke(null, base, height);

        assertThat(out.toString(), containsString(String.valueOf(area)));
    }

    @Test
    public void triangleAreaIsDefined() throws ReflectiveOperationException {
        Method method = Main.class.getDeclaredMethod(
                "triangleArea", int.class, int.class);

        method.setAccessible(true);
        double result = (double)method.invoke(null, base, height);

        assertThat(result,  closeTo(area, ERROR));
    }

    @Test
    public void triangleAreaIsOverloaded() throws ReflectiveOperationException {
        Method method = Main.class.getDeclaredMethod(
                "triangleArea", double.class, double.class);

        method.setAccessible(true);
        double result = (double)method.invoke(null, base, height);

        assertThat(result, closeTo(area, ERROR));
    }
}
