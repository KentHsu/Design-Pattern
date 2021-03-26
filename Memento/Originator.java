package Memento;

public class Originator {
	
	private String state;
	
	public String getState() {
		return this.state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public Memento CreateMemento() {
		return (new Memento(state));
	}
	
	public void resetMemento(Memento memento) {
		System.out.print("\nOriginal state = " + this.state + " ---> ");
		System.out.println("Reset state to " + memento.getState());
		this.state = memento.getState();
		System.out.println("Reset complete!\n");
	}
	
	public void show() {
		System.out.println(this.getClass().getSimpleName() + " state = " + state);
	}
	
}
