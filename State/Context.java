package State;

public class Context {
	
	private State state;
	
	public Context(State state) {
		this.state = state;
	}
	
	public State getState() {
		return this.state;
	}
	
	public void setState(State state) {
		this.state = state;
		System.out.println("Current state: " + state.getClass().getName());
	}
	
	public void request() {
		this.state.handle(this);
	}
}
