package strategy;

public class WindowsStrategy extends TextStrategy {

	public WindowsStrategy(String text) {
		super(text);
	}

	public String replace() {
		startOperation();
		System.out.println(text = text.replaceAll("@n", "@r@n"));
		endOperation();

		return text;
	}

	private void startOperation() {
		System.out.println("WindowsStrategy startOperation");
	}

	private void endOperation() {
		System.out.println("WindowsStrategy endOperation");
	}
}
