package Composite;

public class Leaf extends Component {
	
	public Leaf(String name) {
		super(name);
	}
	
	@Override
	public void add(Component component) {
		System.out.println("You can not add nodes to a leaf!");
	}
	
	@Override
	public void remove(Component component) {
		System.out.println("You can not remove nodes to a leaf!");
	}

	@Override
	public void display(int depth) {
		System.out.println("-".repeat(depth) + name);
	}

}
