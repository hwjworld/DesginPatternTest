package observer;

import java.util.Observable;

public class InvalidMan extends Observable {

	private int state;
	// 差
	public final static int STATE_BAD = 0;
	// 死
	public final static int STATE_DEAD = -1;
	// 良好
	public final static int STATE_FINE = 1;

	public InvalidMan() {
		super();
	}

	public InvalidMan(int state) {
		this.state = state;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void changeState(int state) {
		if (this.state != state) {
			this.state = state;
			this.setChanged();
			if (STATE_BAD == state || STATE_DEAD == state) {
				this.notifyObservers("...危险...");
			} else if (STATE_FINE == state) {
				this.notifyObservers("...准备出院...");
			}
		} else {
			this.notifyObservers("...老样子...");
		}
	}
}
