package Builder;

public class ConcreteBuilder1 extends Builder {
	private Product product = new Product();
	
	@Override
	public void BuildParts1() {
		product.add("Parts A");
	}
	
	@Override
	public void BuildParts2() {
		product.add("Parts B");
	}
	
	@Override
	public Product GetResult() {
		return product;
	}

}
