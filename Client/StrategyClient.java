package Client;
import Strategy.*;

public class StrategyClient {
	public static void main(String[] args) {
		Context c = new Context(new ConcreteStrategyA());
		c.ContextInterface();
		c = new Context(new ConcreteStrategyB());
		c.ContextInterface();
	}
}
