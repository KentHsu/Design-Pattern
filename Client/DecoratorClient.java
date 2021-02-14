package Client;
import Decorator.*;

public class DecoratorClient {
	public static void main(String[] argv) {
		ConcreteComponent c = new ConcreteComponent();
		ConcreteDecoratorA dA = new ConcreteDecoratorA();
		ConcreteDecoratorB dB = new ConcreteDecoratorB();
	
		dA.setComponent(c);
		dB.setComponent(dA);
		dB.operation();
	}
}
