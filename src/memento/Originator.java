package memento;

public class Originator {

	private String name;
	private String phone;

	public Originator(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	// Some operations make state changed
	public void someOperation() {
		name = "noboby";
		phone = "911-911";
	}

	// recover object's state
	public void setMemento(Memento m) {
		this.name = m.getName();
		this.phone = m.getPhone();
	}

	public Memento createMemento() {
		return new Memento(name, phone);
	}

	public void showInfo() {
		System.out.println("Name: " + name + "\nPhone: " + phone + "\n");
	}
}
