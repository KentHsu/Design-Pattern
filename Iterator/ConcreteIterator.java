package Iterator;

public class ConcreteIterator extends Iterator {
	
	private ConcreteAggregate aggregate;
	private int current = 0;
	
	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}
	
	@Override
	public Object first() {
		return this.aggregate.getItem(0);
	}
	
	@Override
	public Object next() {
		current += 1;
		if (this.isEnd())
			return null;
		else
			return this.currentItem();
	}
	
	@Override
	public Object currentItem() {
		return this.aggregate.getItem(current);
	}
	
	@Override
	public boolean isEnd() {
		return (current >= this.aggregate.count());
	}
	
}
