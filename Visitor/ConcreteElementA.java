package Visitor;

public class ConcreteElementA extends Element {
	
	@Override
	public void accept(Visitor visitor) {
		visitor.VisitConcreteElementA(this);
	}
	
	public void operationA() {}
}
