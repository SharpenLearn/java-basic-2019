import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class PublisherTest {

	@Test
	public void shouldSendMessageToSubscriber() {

		Subscriber subscriber = mock(Subscriber.class);
		Publisher publisher = new Publisher(subscriber);

		when(subscriber.receive("hello")).thenReturn("ok");

		String actual = publisher.send("hello");

		assertThat(actual, is("ok"));
		verify(subscriber).receive("hello");
	}
}
