package Singleton;

public class SingletonDoubleCheckingLock {
	
	private static volatile SingletonDoubleCheckingLock instance;
	public String value;
	
	private SingletonDoubleCheckingLock(String value) {
		this.value = value;
	}
	
	public static SingletonDoubleCheckingLock getInstance(String value) {
		if (instance == null) {
			synchronized(SingletonDoubleCheckingLock.class) {
				if (instance == null)
					instance = new SingletonDoubleCheckingLock(value);
			}
		}
		return instance;
	}
}
