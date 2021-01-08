package AbstractFactory;

public class ConcreteFactory2 implements AbstractFactory {
	
	public AbstractProductA CreateProductA() {
		return new ProductA2();
	}
	
	public AbstractProductB CreateProductB() {
		return new ProductB2();
	}
}
