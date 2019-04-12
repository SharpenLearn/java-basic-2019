package jp.co.navitime.j05.p02;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;

import org.junit.Test;

public class PointTest {

    @Test
    public void testEquals() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);

        assertThat(point1 == point2, is(false));
        assertThat(point1.equals(null), is(false));
        assertThat(point1.equals(new Object()), is(false));
        assertThat(point1.equals(point2), is(true));
        assertThat(point1, is(point2));
    }
}
