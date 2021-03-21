package Interpreter;

public class NonTerminalExpression extends AbstractExpression {
	
	@Override
	public void Interpret(Context context) {
		System.out.println("Non-terminal interpreter!");
	}
	
}
