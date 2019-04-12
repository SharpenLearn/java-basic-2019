interface Subscriber {
	String receive(String message);
}

public class Publisher {

	private Subscriber subscriber;

	public Publisher(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

	public String send(String message) {
		return subscriber.receive(message);
	}
}
