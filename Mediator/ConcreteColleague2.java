package Mediator;

public class ConcreteColleague2 extends Colleague {
	
	public ConcreteColleague2(Mediator mediator) {
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
