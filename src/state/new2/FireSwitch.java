package state.new2;

public class FireSwitch {

    private IState current;

    public FireSwitch() { 
        current = new OffState(); 
    }

    public void setState(IState s) { 
        current = s; 
    }

    public void switchClockWise() { 
        current.switchClockWise(this); 
    }

    public void switchCountClock() { 
       current.switchCountClock(this); 
    } 
}
