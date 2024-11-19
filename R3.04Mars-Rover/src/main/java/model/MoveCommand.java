package model;

public class MoveCommand implements Command {
	private final Robot robot;
	
	public MoveCommand(Robot robot) {
		this.robot = robot;
	}

	@Override
	public void execute() {
		
	}
}
