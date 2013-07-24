package proxy.dynamicProxy;

public class Main {
	public static void main(String[] args) {

		LogHandler logHandler = new LogHandler();
		IHello helloProxy = (IHello) logHandler.bind(new HelloSpeaker());
		helloProxy.hello("Justin");
	}
}
