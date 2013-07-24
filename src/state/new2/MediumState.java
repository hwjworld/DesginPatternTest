package state.new2;

public class MediumState implements IState {

	public void switchClockWise(FireSwitch sw) {
		sw.setState(new LargeState());
		System.out.println("large fire");
	}

	public void switchCountClock(FireSwitch sw) {
		sw.setState(new SmallState());
		System.out.println("small fire");
	}
}
