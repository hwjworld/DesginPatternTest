package abstractFactory;

public class MacWidgetFactory implements IWidgetFactory {

	@Override
	public IButton getButton() {
        return new MacButton();
	}

	@Override
	public ITextField getTextField() {
        return new MacTextField();
	}

}
