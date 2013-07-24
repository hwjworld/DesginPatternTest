package state.new2;

public class SmallState implements IState {
	public void switchClockWise(FireSwitch sw) {
		sw.setState(new MediumState());
		System.out.println("medium fire");
	}

	public void switchCountClock(FireSwitch sw) {
		sw.setState(new OffState());
		System.out.println("off fire");
	}
}