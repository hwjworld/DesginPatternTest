package proxy;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 两种代理的方法实现hello
 * @author Administrator
 *
 */
public class HellpSpeakold {
	private Logger logger = Logger.getLogger(this.getClass().getName());

	public void hello(String name) {
		logger.log(Level.INFO, "hello method starts....");

		System.out.println("Hello, " + name);

		logger.log(Level.INFO, "hello method ends....");
	}

	public static void main(String[] args) {
		new HellpSpeakold().hello("hwj");
	}
}
