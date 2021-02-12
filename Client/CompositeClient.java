package Client;

import Composite.*;

public class CompositeClient {
	public static void main(String[] args) {
		Composite root = new Composite("Root");
		root.add(new Composite("Leaf A"));
		root.add(new Composite("Leaf B"));
		
		Composite compX = new Composite("Composite X");
		compX.add(new Leaf("Leaf XA"));
		compX.add(new Leaf("Leaf XB"));
		root.add(compX);
		
		Composite compY = new Composite("Composite Y");
		compY.add(new Leaf("Leaf YA"));
		compY.add(new Leaf("Leaf YB"));
		root.add(compY);
		
		root.add(new Leaf("Leaf C"));
		
		root.display(0);
	}
}
