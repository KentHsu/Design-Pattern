package Client;
import Bridge.*;

public class BridgeClient {
	public static void main(String[] argv) {
		Abstraction ab = new RefinedAbstraction();
	
		ab.SetImplementor(new ConcreteImplementorA());
		ab.Operation();
	
		ab.SetImplementor(new ConcreteImplementorB());
		ab.Operation();
	}
}
