package Builder;

public class ConcreteBuilder2 extends Builder {
	private Product product = new Product();
	
	@Override
	public void BuildParts1() {
		product.add("Parts X");
	}
	
	@Override
	public void BuildParts2() {
		product.add("Parts Y");
	}
	
	@Override
	public Product GetResult() {
		return product;
	}

}
