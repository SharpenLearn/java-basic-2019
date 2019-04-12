package jp.co.navitime.j01.p09;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MainTest {

    private static final double ERROR = 1.0e-6;

    private int ax;
    private int ay;
    private int bx;
    private int by;
    private double distance;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                {10, 20, 10, 22, 2.0},
                {10, 20, 15, 40, 20.615528128088304},
                {10, 20, 40, 20, 30.0},
        });
    }

    public MainTest(int ax, int ay, int bx, int by, double distance) {
        this.ax = ax;
        this.ay = ay;
        this.bx = bx;
        this.by = by;
        this.distance = distance;
    }

    @Test
    public void toDateTimeIsDefined() throws ReflectiveOperationException {
        Method calcDistance = Main.class.getDeclaredMethod(
                "calcDistance", int.class, int.class, int.class, int.class);
        calcDistance.setAccessible(true);

        double result = (double)calcDistance.invoke(null, ax, ay, bx, by);

        assertThat(result, closeTo(distance, ERROR));
    }
}
