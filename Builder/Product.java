package Builder;
import java.util.*;

public class Product {
	List<String> parts = new ArrayList<String>();
	
	public void add(String component) {
		parts.add(component);
	}
	
	public void show() {
		for (String component: parts)
			System.out.println(component);
	}
}
