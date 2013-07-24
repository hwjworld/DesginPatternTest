package proxy.staticproxy;

public class Main {
	public static void main(String[] args) {
		HelloProxy proxy = new HelloProxy(new HelloSpeaker());
		proxy.hello("hwj");
	}
}
