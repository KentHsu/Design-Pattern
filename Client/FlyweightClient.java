package Client;
import Flyweight.*;

public class FlyweightClient {
	public static void main(String[] args) {
		
		int state = 20;
		FlyweightFactory f = new FlyweightFactory();
		
		Flyweight fx = f.getFlyweight("X");
		fx.Operation(--state);
		
		Flyweight fy = f.getFlyweight("Y");
		fy.Operation(--state);
		
		Flyweight fz = f.getFlyweight("Z");
		fz.Operation(--state);
		
		
		Flyweight uf = new UnsharedConcreteFlyweight();
		uf.Operation(--state);
	}
}
