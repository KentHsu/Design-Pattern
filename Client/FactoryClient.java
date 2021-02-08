package Client;
import Factory.*;

public class FactoryClient {
	public static void main(String[] args) {
		Creator factoryA = new ConcreteCreatorA();
		Product A = factoryA.FactoryMethod();
		A.produce();
		
		Creator factoryB = new ConcreteCreatorB();
		Product B = factoryB.FactoryMethod();
		B.produce();
	}
}
