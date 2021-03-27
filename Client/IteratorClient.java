package Client;
import Iterator.*;

public class IteratorClient {
	public static void main(String[] args) {
		ConcreteAggregate agg = new ConcreteAggregate();
		agg.addItem("a"); agg.addItem("b"); agg.addItem("c");
		agg.addItem("d"); agg.addItem("e"); agg.addItem("f");
		
		Iterator iter = new ConcreteIterator(agg);
		Object head = iter.first();
		System.out.println("The fisrt item is " + head);
		while (!iter.isEnd()) {
			System.out.println("Current item: " + iter.currentItem());
			iter.next();
		}
	}
}
