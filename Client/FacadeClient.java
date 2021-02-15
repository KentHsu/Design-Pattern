package Client;
import Facade.*;

public class FacadeClient {
	public static void main(String[] args) {
		Facade facade = new Facade();
		
		System.out.println("Method A: ");
		facade.methodA();
		
		System.out.println("Method B: ");
		facade.methodB();
	}

}
