package Flyweight;

import java.util.HashMap;

public class FlyweightFactory {
	
	private HashMap<String, Flyweight> flyweight = new HashMap<> ();
	
	public FlyweightFactory() {
		flyweight.put("X", new ConcreteFlyweight());
		flyweight.put("Y", new ConcreteFlyweight());
		flyweight.put("Z", new ConcreteFlyweight());
	}
	
	public Flyweight getFlyweight(String key) {
		return flyweight.get(key);
	}
}
