package objectAdapter;

import java.util.Enumeration;
import java.util.Vector;

public class MessageClient {

	private MessageApplication msgApp;
	private Enumeration iteratorAdapter;

	public void run() {
		Vector vector = new Vector();
		for (int i = 0; i < 10; i++)
			vector.addElement("物件 " + i);

		// use adapter

		iteratorAdapter = new IteratorAdapter(vector.iterator());
		// We could still use MessageApplication
		msgApp = new MessageApplication();
		msgApp.showAllMessage(vector.elements());
	}

	public static void main(String[] args) {
		MessageClient msgClient = new MessageClient();
		msgClient.run();
	}
}
