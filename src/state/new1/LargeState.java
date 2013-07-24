package state.new1;

public class LargeState implements IState {

	public void switchFire(FireSwitch sw) {
		sw.setState(new OffState());
		System.out.println("off fire");
	}
}
