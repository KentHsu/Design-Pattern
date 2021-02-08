package Client;
import Adaptor.*;

public class AdaptorClient {
	public static void main(String[] args) {
		Target target = new Adaptor();
		target.Request();
		
	}
}
