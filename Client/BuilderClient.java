package Client;
import Builder.*;

public class BuilderClient {
	public static void main(String[] argv) {
		Director director = new Director();
		Builder builder1 = new ConcreteBuilder1();
		Builder builder2 = new ConcreteBuilder2();
		
		director.Construct(builder1);
		Product p1 = builder1.GetResult();
		p1.show();
		
		director.Construct(builder2);
		Product p2 = builder2.GetResult();
		p2.show();
	}
}
