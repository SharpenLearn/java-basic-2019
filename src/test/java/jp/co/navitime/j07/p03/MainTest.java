package jp.co.navitime.j07.p03;

import static jp.co.navitime.j07.p03.Main.getLastValue;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class MainTest {
    @Test
    public void returnsLastValue() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);

        Integer actual = getLastValue(list);
        assertThat(actual, is(10));
    }
}
