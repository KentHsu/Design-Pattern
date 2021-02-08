package Client;
import Prototype.*;

public class PrototypeClient {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		ConcretePrototype a = new ConcretePrototype("123");
		ConcretePrototype b = a.clone();
		System.out.println(a.getId());
		System.out.println(b.getId());
		System.out.println(b.equals(a));
		
		b.setId("456");
		System.out.println(a.getId());
		System.out.println(b.getId());
		System.out.println(b.equals(a));
	}
}
