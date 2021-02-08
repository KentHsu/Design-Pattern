package Client;
import Singleton.*;

public class SingletonClient {
	public static void main(String [] args) {
		Singleton s1 = Singleton.getInstance("Foo");
		Singleton s2 = Singleton.getInstance("Bar");
		System.out.println(s1.value);
		System.out.println(s2.value);

		if (s1 == s2) {
			System.out.println("s1 and s2 are the same.");
		}
	}
}
