package Factory;

public class ConcreteCreatorA implements Creator {
	public Product FactoryMethod() {
		return (new ConcreteProductA());
	}
}
