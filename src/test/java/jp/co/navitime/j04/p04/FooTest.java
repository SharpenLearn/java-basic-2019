package jp.co.navitime.j04.p04;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.junit.MatcherAssert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class FooTest {

    @Test
    public void mockCallingTestingPractice() {
        Foo mock = mock(Foo.class);
        mock.takeNothing();

        // TODO: Remove and implement here.
		fail();
    }

    @Test
    public void mockArgumentTestingPractice() {
        Foo mock = mock(Foo.class);
        mock.takeInt(1);
        mock.takeInt(2);
        mock.takeInt(3);

        // TODO: Remove and implement here.
        fail();
    }

    @Test
    public void mockReturnValueTestingPractice() {
        Foo mock = mock(Foo.class);

        // Returns 2 normally but 4 when taking 3.
        when(mock.takeIntAndReturnInt(anyInt())).thenReturn(2);
        when(mock.takeIntAndReturnInt(3)).thenReturn(4);

        int returnValue1 = mock.takeIntAndReturnInt(1);
        int returnValue2 = mock.takeIntAndReturnInt(2);
        int returnValue3 = mock.takeIntAndReturnInt(3);

        // TODO: Remove and implement here.
		fail();
    }

    @Test
    public void mockingPractice() {
        Foo mock = mock(Foo.class);

        // TODO: Implement here.

        // Don't change below.
        String returnValue1 = mock.takeTwoStringsAndReturnString("ABC", "DEF");
        verify(mock).takeTwoStringsAndReturnString("ABC", "DEF");
        assertThat(returnValue1, equalTo("ABCDEF"));
    }
}
