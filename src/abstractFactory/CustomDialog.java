package abstractFactory;

/**
 * 如果要更换所有的视感元件，就只要抽象掉具体的Factory就可以了 简单的说，在Abstract
 * 
 * Factory模式中将具体的Product封装在具体Factory实现中，而客户仍只要面对Factory与Product的抽象介面，避免依赖于具
 * 体的Factory与Product，由于Factory封装了所必须的Product，所以要更换掉所有的元件，只要简单的抽换掉Factory就可以
 * 了，不用修改客户端的程式。
 * 
 * @author Administrator
 * 
 */
public class CustomDialog {
	private IButton button;
	private ITextField textField;

	public CustomDialog(IWidgetFactory widgetFactory) {
		setWidgetFactory(widgetFactory);
	}

	// 由于客户端只依赖于抽象的工厂，工厂如何实作并无关客户端的事
	// 要抽换工厂并不需要改动客户端的程式
	public void setWidgetFactory(IWidgetFactory widgetFactory) {
		setButton(widgetFactory.getButton());
		setTextField(widgetFactory.getTextField());

	}

	public void layoutAllComponents() {
		// layout all components
	}

	// 这边也是依赖抽象，实际改变了元件实例
	// 客户端代码也不用更改
	public void setButton(IButton button) {
		this.button = button;
	}

	public void setTextField(ITextField textField) {
		this.textField = textField;
	}

	public void showDialog() {
		this.paintDialog();
		button.paintButton();
		textField.paintTextField();
	}

	public void paintDialog() {
		System.out.println("custom dialog paints....");
	}

	public static void main(String[] args) {
		new CustomDialog(new MacWidgetFactory()).showDialog();
		new CustomDialog(new WindowsWidgetFactory()).showDialog();
	}
}
