package state.new1;

public class SmallState implements IState {

	public void switchFire(FireSwitch sw) {
		sw.setState(new MediumState());
		System.out.println("medium fire");
	}
}
