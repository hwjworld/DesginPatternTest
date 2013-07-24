package prototype;

import java.awt.Rectangle;

public class SquareTable extends AbstractFurniture {

	protected Rectangle rectangle;

	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	protected Object clone() throws CloneNotSupportedException {
		Object o = super.clone();
		if (this.rectangle != null) {
			((SquareTable) o).rectangle = (Rectangle) rectangle.clone();
		}

		return o;
	}

	public void draw() {
		System.out.print("\t方桌\t位置：(" + rectangle.getX() + ", "
				+ rectangle.getY() + ")");
		System.out.println(" / 宽高：(" + rectangle.getWidth() + ", "
				+ rectangle.getHeight() + ")");
	}

}
