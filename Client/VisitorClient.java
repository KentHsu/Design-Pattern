package Client;
import Visitor.*;

public class VisitorClient {
	public static void main(String[] args) {
		ObjectStructure objStruc = new ObjectStructure();
		objStruc.attach(new ConcreteElementA());
		objStruc.attach(new ConcreteElementB());
		
		ConcreteVisitor1 v1 = new ConcreteVisitor1();
		ConcreteVisitor2 v2 = new ConcreteVisitor2();
		objStruc.accept(v1);
		objStruc.accept(v2);
	}
}
