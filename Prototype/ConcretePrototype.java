package Prototype;
import java.lang.Cloneable;

public class ConcretePrototype implements Cloneable {
	
	private String id;
	
	public ConcretePrototype(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public ConcretePrototype clone() throws CloneNotSupportedException {
		return (ConcretePrototype)super.clone();
	}
}
