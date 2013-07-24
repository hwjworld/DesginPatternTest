package state.origin;

public class State {

    private int state;

    public State() { 
        state = 0; 
    } 

    public void switchFire() { 
        if (state == 0) { 
            state = 1; 
            System.out.println( "small fire" ); 
        } else if (state == 1) { 
            state = 2; 
            System.out.println( "medium fire" ); 
        } else if (state == 2) { 
            state = 3; 
            System.out.println( "large fire" ); 
        } else { 
            state = 0; 
            System.out.println( "turning off" ); 
        } 
    } 
}
