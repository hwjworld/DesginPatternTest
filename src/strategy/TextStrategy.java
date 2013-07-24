package strategy;

public abstract class TextStrategy {

	protected String text;

	public TextStrategy(String text) {
		this.text = text;
	}

	public abstract String replace();
}
