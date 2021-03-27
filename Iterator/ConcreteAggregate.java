package Iterator;
import java.util.*;

public class ConcreteAggregate extends Aggregate {
	
	private List<Object> items = new ArrayList<> ();
	
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}
	
	public int count() {
		return items.size();
	}
	
	public Object getItem(int index) {
		return items.get(index);
	}
	
	public void addItem(Object item) {
		items.add(item);
	}
	
}
