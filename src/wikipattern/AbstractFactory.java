package wikipattern;

interface Button{
	void paint();
}
interface GUIFactory{
	Button createButton();
}
class WinFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new WinButton();
	}
	
}
class LinuxFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new LinuxButton();
	}
	
}

class WinButton implements Button{

	@Override
	public void paint() {
		System.out.println("win button");
	}
	
}
class LinuxButton implements Button{

	@Override
	public void paint() {
		System.out.println("linux button");
		
	}
	
}

class Application{
	public Application(GUIFactory factory) {
		Button button = factory.createButton();
		button.paint();
	}
}
public class AbstractFactory {
	private static int osType = 2;
	public static void main(String[] args) {
		new Application(createOsFactory());
	}
	public static GUIFactory createOsFactory(){
		if(osType == 1){
			return new LinuxFactory();
		}else{
			return new WinFactory();
		}
	}
}
