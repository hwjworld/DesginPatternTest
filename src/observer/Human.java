package observer;

import java.util.Observable;
import java.util.Observer;

public class Human implements Observer {

	private String name;

	public Human() {
		super();
	}

	public Human(String name) {
		super();
		this.name = name;
	}

	public void update(Observable o, Object arg) {
		// 获取被观察对象当前的状态
		System.out.println(((InvalidMan) o).getState());
		// 向当前观察者通知消息
		System.out.println(name + arg);
	}

}
