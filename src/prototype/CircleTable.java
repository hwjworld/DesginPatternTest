package prototype;

import java.awt.Point;

public class CircleTable extends AbstractFurniture {
	protected Point center;

	public void setCenter(Point center) {
		this.center = center;
	}

	protected Object clone() throws CloneNotSupportedException {
		Object o = super.clone();
		if (this.center != null) {
			((CircleTable) o).center = (Point) center.clone();
		}

		return o;
	}

	public void draw() {
		System.out.println("\t圆桌\t中心：(" + center.getX() + ", " + center.getY()
				+ ")");
	}

}
