package model;

public class RotateLeftCommand implements Command {
	private final Robot robot;
	
	public RotateLeftCommand(Robot robot) {
		this.robot = robot;
	}

	@Override
	public void execute() {
		robot.turn('l');
	}
}
