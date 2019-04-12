package jp.co.navitime.j07.p06;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class MainTest {

    private int min;
    private int max;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                {0, 0},
                {-1, 0},
                {1, 100},
        });
    }

    public MainTest(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Test
    public void test() {
        List<Integer> list = Main.createDistinctIntegerList(min, max);
        assertThat(list.size(), is(max - min + 1));

        for (int value = min; value <= max; value++) {
            assertThat(list, hasItem(equalTo(value)));
        }
    }
}
