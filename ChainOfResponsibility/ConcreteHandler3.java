package ChainOfResponsibility;

public class ConcreteHandler3 extends Handler {
	
	@Override
	public void HandleRequest(int request) {
		if (request >= 20 && request < 30) {
			System.out.println(this.getClass().getSimpleName() + " requests " + request);
		}
		else if (successor != null) {
			successor.HandleRequest(request);
		}
	}
	
}
