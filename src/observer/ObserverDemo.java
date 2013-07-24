package observer;

import java.util.Observer;

public class ObserverDemo {

	public ObserverDemo() {
	}

	public static void main(String[] args) {
		// 被观察者
		InvalidMan o1 = new InvalidMan(InvalidMan.STATE_BAD);
		// 观察员
		Observer oo1 = new Human("医生");
		// 观察员
		Observer oo2 = new Human("护士");
		// 观察员
		Observer oo3 = new Human("家人");
		// 向被观察对象注册观察员
		// 为病人注册 观察员：医生，护士，家人
		o1.addObserver(oo1);
		o1.addObserver(oo2);
		o1.addObserver(oo3);
		// 更改被观察对象的状态
		o1.changeState(InvalidMan.STATE_DEAD);
		o1.changeState(InvalidMan.STATE_BAD);
		o1.changeState(InvalidMan.STATE_FINE);
	}
}
