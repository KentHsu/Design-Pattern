package Client;
import java.util.*;
import Interpreter.*;

public class InterpreterClient {
	public static void main(String[] args) {
		Context context = new Context();
		List<AbstractExpression> items = new ArrayList<> ();
		items.add(new TerminalExpression());
		items.add(new NonTerminalExpression());
		
		for (AbstractExpression item : items) {
			item.Interpret(context);
		}
	}
}
