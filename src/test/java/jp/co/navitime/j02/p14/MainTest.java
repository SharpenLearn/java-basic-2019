package jp.co.navitime.j02.p14;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;

import org.junit.Test;

public class MainTest {

    @Test
    public void compareSameStringReturnsTrue() {
        assertThat(Main.compareSameStrings(), is(true));
    }
}
