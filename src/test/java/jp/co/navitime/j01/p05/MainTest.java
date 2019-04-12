package jp.co.navitime.j01.p05;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MainTest {

    private int age;
    private int fee;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                {0, 0},
                {1, 0},
                {3, 0},
                {4, 600},
                {10, 600},
                {12, 600},
                {13, 1200},
                {20, 1200},
        });
    }

    public MainTest(int age, int fee) {
        this.age = age;
        this.fee = fee;
    }

    @Test
    public void testProblem() throws ReflectiveOperationException {
        Method getFee = Main.class.getDeclaredMethod("getFee", int.class);
        getFee.setAccessible(true);

        assertThat(getFee.invoke(null, age), is(fee));
    }
}
