package state.new1;

public class MediumState implements IState {

	public void switchFire(FireSwitch sw) {
		sw.setState(new LargeState());
		System.out.println("large fire");
	}
}
