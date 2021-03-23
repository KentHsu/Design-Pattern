package Mediator;

public class ConcreteColleague1 extends Colleague {
	
	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	
	public void send(String message) {
		System.out.println(this.getClass().getSimpleName() + " send a message: " + message);
		mediator.send(message, this);
	}
	
	public void Notify(String message) {
		System.out.println(this.getClass().getSimpleName() + " get a message: " + message);
	}
	
}
