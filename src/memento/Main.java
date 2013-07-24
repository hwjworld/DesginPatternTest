package memento;

public class Main {

	public static void main(String[] args) {
		Originator originator = new Originator("Justin", "888-8888");
		Caretaker caretaker = new Caretaker();

		// save object's memento
		caretaker.setMemento(originator.createMemento());

		originator.showInfo();
		// some operations make the object's state changed
		originator.someOperation();
		originator.showInfo();

		// use memento to recover object's state
		originator.setMemento(caretaker.getMemento());
		originator.showInfo();
	}
}
