package state.new1;

public class OffState implements IState {

	public void switchFire(FireSwitch sw) {
		sw.setState(new SmallState());
		System.out.println("small fire");
	}
}
