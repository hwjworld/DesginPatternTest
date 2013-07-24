package abstractFactory;

public interface IWidgetFactory {
    public IButton getButton();
    public ITextField getTextField();
}
