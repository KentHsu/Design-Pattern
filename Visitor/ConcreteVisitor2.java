package Visitor;

public class ConcreteVisitor2 extends Visitor {
	
	@Override
	public void VisitConcreteElementA(ConcreteElementA elemA) {
		System.out.println(this.getClass().getSimpleName() 
				+ " + " + elemA.getClass().getSimpleName());
	}
	
	@Override
	public void VisitConcreteElementB(ConcreteElementB elemB) {
		System.out.println(elemB.getClass().getSimpleName() 
				+ " + " + this.getClass().getSimpleName());	
	}
	
}
