package Client;
import AbstractFactory.*;

public class AbstractFactoryClient {
	public static void main(String[] args) {
		
		AbstractFactory factory = new ConcreteFactory1();
		AbstractProductA productA1 = factory.CreateProductA();
		productA1.manufacturing();
		AbstractProductB productB1 = factory.CreateProductB();
		productB1.manufacturing();

	}
}
