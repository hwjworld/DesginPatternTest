package state.new1;

public class FireSwitch {

	private IState current;

	public FireSwitch() {
		current = new OffState();
	}

	public void setState(IState s) {
		current = s;
	}

	public void switchFire() {
		current.switchFire(this);
	}
}
