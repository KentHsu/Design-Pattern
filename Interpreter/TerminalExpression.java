package Interpreter;

public class TerminalExpression extends AbstractExpression {
	
	@Override
	public void Interpret(Context context) {
		System.out.println("Terminal interpreter!");
	}
	
}
