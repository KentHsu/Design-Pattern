package Adaptor;

public class Adaptor extends Target {
	
	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void Request() {
		adaptee.SpecificRequest();
	}
}
