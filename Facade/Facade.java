package Facade;

public class Facade {
	
	private SubSystemOne one;
	private SubSystemTwo two;
	private SubSystemThree three;
	private SubSystemFour four;
	
	public Facade() {
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
		four = new SubSystemFour();
	}
	
	public void methodA() {
		one.methodOne();
		three.methodThree();
	}
	
	public void methodB() {
		two.methodTwo();
		four.methodFour();
	}
}
