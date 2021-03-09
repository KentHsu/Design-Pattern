package Observer;

public class ConcreteObserver implements Observer {
	private String name;
	private String observerState = name;
	private ConcreteSubject subject;
	
	public ConcreteObserver(String name, ConcreteSubject subject) {
		this.name = name;
		this.subject = subject;
	}
	
	public void update() {
		observerState = subject.getSubjectState();
		System.out.println(name + ": " + observerState);
	}
}
