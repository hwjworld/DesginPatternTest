package command;

public class Client {

	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		invoker.addCommand("JUSTIN", new UpperCaseHello("Justin"));
		invoker.addCommand("momor", new LowerCaseHello("momor"));

		// simulate random request
		String[] req = { "JUSTIN", "momor" };
		while (true) {
			int i = (int) (Math.random() * 10) % 2;
			invoker.request(req[i]);
		}
	}
}
