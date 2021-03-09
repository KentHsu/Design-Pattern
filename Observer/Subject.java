package Observer;
import java.util.*;

public abstract class Subject {
	private List<Observer> observers = new ArrayList<Observer> ();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	public void Notify() {
		for (Observer obs: observers)
			obs.update();
	}
}
