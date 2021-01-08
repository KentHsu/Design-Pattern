package Factory;

public class ConcreteCreatorB implements Creator {
	public Product FactoryMethod() {
		return (new ConcreteProductB());
	}
}
