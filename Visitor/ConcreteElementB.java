package Visitor;

public class ConcreteElementB extends Element {
	
	@Override
	public void accept(Visitor visitor) {
		visitor.VisitConcreteElementB(this);
	}
	
	public void operationB() {}
}
