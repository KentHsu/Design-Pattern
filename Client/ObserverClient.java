package Client;
import Observer.*;

public class ObserverClient {
	public static void main(String[] argv) {
		ConcreteSubject s = new ConcreteSubject();
		
		s.attach(new ConcreteObserver("obs1", s));
		s.attach(new ConcreteObserver("obs2", s));
		s.Notify();
		
		s.setSubjectState("xyz");
		s.Notify();
	}
}
