package jp.co.navitime.j01.p08;

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

    private int year;
    private boolean isLeapYear;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                {2016, true},
                {2020, true},
                {2228, true},
                {2017, false},
                {2035, false},
                {2230, false},
        });
    }

    public MainTest(int year, boolean isLeapYear) {
        this.year = year;
        this.isLeapYear = isLeapYear;
    }

    @Test
    public void toDateTimeIsDefined() throws ReflectiveOperationException {
        Method isLeapYear_ = Main.class.getDeclaredMethod("isLeapYear", int.class);
        isLeapYear_.setAccessible(true);

        assertThat(isLeapYear_.invoke(null, year), is(isLeapYear));
    }
}
