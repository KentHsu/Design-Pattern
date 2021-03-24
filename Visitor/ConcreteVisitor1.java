package Visitor;

public class ConcreteVisitor1 extends Visitor {
	
	@Override
	public void VisitConcreteElementA(ConcreteElementA elemA) {
		System.out.println(elemA.getClass().getSimpleName() 
				+ " + " + this.getClass().getSimpleName());
	}
	
	@Override
	public void VisitConcreteElementB(ConcreteElementB elemB) {
		System.out.println(this.getClass().getSimpleName() 
				+ " + " + elemB.getClass().getSimpleName());	
	}
	
}
