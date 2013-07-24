package prototype;

import java.util.Enumeration;
import java.util.Vector;

public class House {

	private Vector vector;

	public House() {
		vector = new Vector();
	}

	public void addFurniture(AbstractFurniture furniture) {
		vector.addElement(furniture);

		System.out.println("现有家具....");

		Enumeration enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			AbstractFurniture f = (AbstractFurniture) enumeration.nextElement();
			f.draw();
		}
		System.out.println();
	}
}
