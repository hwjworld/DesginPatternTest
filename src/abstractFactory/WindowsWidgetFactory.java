package abstractFactory;

public class WindowsWidgetFactory implements IWidgetFactory  {

	@Override
	public IButton getButton() {
        return new WindowsButton();
	}

	@Override
	public ITextField getTextField() {
        return new WindowsTextField();
	}

}
