package jp.co.navitime.j01.p07;

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

    private int seconds;
    private String datetime;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                {3820, "1時間3分40秒"},
                {7543, "2時間5分43秒"},
                {435, "0時間7分15秒"},
        });
    }

    public MainTest(int seconds, String datetime) {
        this.seconds = seconds;
        this.datetime = datetime;
    }

    @Test
    public void toDateTimeIsDefined() throws ReflectiveOperationException {
        Method toDateTime = Main.class.getDeclaredMethod("toDateTime", int.class);
        toDateTime.setAccessible(true);

        assertThat(toDateTime.invoke(null, seconds), is(datetime));
    }
}
