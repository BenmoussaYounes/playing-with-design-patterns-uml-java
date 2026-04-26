package behavioral.command;

public class ConcreteCommand implements Command{
	
	final String state;
	final Receiver receiver;
	
	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
		state = "initial state";
	}

	@Override
	public void execute() {
		receiver.action();
	}
	
}
