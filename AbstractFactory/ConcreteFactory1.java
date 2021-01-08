package AbstractFactory;

public class ConcreteFactory1 implements AbstractFactory {
	
	public AbstractProductA CreateProductA() {
		return new ProductA1();
	}
	
	public AbstractProductB CreateProductB() {
		return new ProductB1();
	}
}
