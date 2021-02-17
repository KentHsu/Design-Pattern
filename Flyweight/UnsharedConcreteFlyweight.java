package Flyweight;

public class UnsharedConcreteFlyweight extends Flyweight {
	
	@Override
	public void Operation(int extrinsicState) {
		System.out.println("Ushared concrete flyweight" + extrinsicState);
	}
}
