package Singleton;

public class SingletonClientMultiThread {
	public static void main(String[] args) {
		Thread threadFoo = new Thread(new ThreadFoo());
		Thread threadBar = new Thread(new ThreadBar());
		threadFoo.start();
		threadBar.start();
	}
	
	static class ThreadFoo implements Runnable {
		@Override
		public void run() {
			SingletonDoubleCheckingLock singleton = SingletonDoubleCheckingLock.getInstance("Foo");
			System.out.println(singleton.value);
		}
	}

	static class ThreadBar implements Runnable {
		@Override
		public void run() {
			SingletonDoubleCheckingLock singleton = SingletonDoubleCheckingLock.getInstance("Bar");
			System.out.println(singleton.value);
		}
	}
}
