package Decorator;

public class ConcreteDecoratorB extends Decorator {
	
	@Override
	public void operation() {
		super.operation();
		System.out.println("Concrete decorator B: " + addedBehavior());
	}
	
	public String addedBehavior() {
		return "New Behavior!";
	}
}
