package proxy.dynamicProxy;

public class HelloSpeaker implements IHello {

	@Override
	public void hello(String name) {
		System.out.println("Hello, " + name);

	}

}
