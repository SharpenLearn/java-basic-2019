package jp.co.navitime.j02.p03;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import java.lang.reflect.Method;

import org.junit.Test;

public class MainTest {

    private static final int[] ARRAY = {60, 45, 50, 90, 80, 70};

    private static final double EXPECTED_AVERAGE = 65.83333333333333;
    private static final double ERROR = 1.0e-6;

    private static final int[] EXPECTED_SORTED_ARRAY = {90, 80, 70, 60, 50, 45};

    @Test
    public void averageIsDefined() throws ReflectiveOperationException {
        Method average = Main.class.getDeclaredMethod("average", int[].class);
        average.setAccessible(true);

        final double result = (double) average.invoke(null, (Object) ARRAY);

        assertThat(result, closeTo(EXPECTED_AVERAGE, ERROR));
    }

    @Test
    public void descendingSortIsDefined() throws ReflectiveOperationException {
        Method descendingSort
            = Main.class.getDeclaredMethod("descendingSort", int[].class);
        descendingSort.setAccessible(true);

        int[] result = (int[]) descendingSort.invoke(null, (Object) ARRAY);

        assertThat(result, is(EXPECTED_SORTED_ARRAY));
    }
}
