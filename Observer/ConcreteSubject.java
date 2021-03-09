package Observer;

public class ConcreteSubject extends Subject {
	private String subjectState = "abc";
	
	public String getSubjectState() {
		return subjectState;
	}
	
	public void setSubjectState(String state) {
		subjectState = state;
	}
}
