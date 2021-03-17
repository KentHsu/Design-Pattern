package Client;
import State.*;

public class StateClient {
	public static void main(String[] argv) {
		Context c = new Context(new ConcreteStateA());
		c.request();
		c.request();
		c.request();
		c.request();
	}
}
