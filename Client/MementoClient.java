package Client;
import Memento.*;

public class MementoClient {
	public static void main(String[] args) {
		Originator orig = new Originator();
		orig.setState("On");
		orig.show();
		
		CareTaker careTaker = new CareTaker();
		careTaker.setMemento(orig.CreateMemento());
		
		orig.setState("Off");
		orig.show();
		
		orig.resetMemento(careTaker.getMemento());
		orig.show();
	}
}
