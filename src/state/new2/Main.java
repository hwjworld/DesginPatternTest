package state.new2;

public class Main {

	public static void main(String[] args) {
		FireSwitch fireSwitch = new FireSwitch();

		fireSwitch.switchClockWise();
		fireSwitch.switchClockWise();
		fireSwitch.switchClockWise();
		fireSwitch.switchClockWise();

		System.out.println();

		fireSwitch.switchCountClock();
		fireSwitch.switchCountClock();
		fireSwitch.switchCountClock();
		fireSwitch.switchCountClock();
	}
}
