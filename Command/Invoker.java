package Command;

public class Invoker {
	private Command command;
	
	public void SetCommand(Command command) {
		this.command = command;
	}
	
	public void ExecuteCommand() {
		command.execute();
	}
}
