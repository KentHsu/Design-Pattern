package ChainOfResponsibility;

public class ConcreteHandler1 extends Handler {
	
	@Override
	public void HandleRequest(int request) {
		if (request >= 0 && request < 10) {
			System.out.println(this.getClass().getSimpleName() + " requests " + request);
		}
		else if (successor != null) {
			successor.HandleRequest(request);
		}
	}
	
}
