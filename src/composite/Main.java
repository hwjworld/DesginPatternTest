package composite;

public class Main {
	public static void main(String[] args) {
		Picture p = new Picture();
		p.add(new Text());
		p.add(new Line());
		new Rectangle().draw();
		Picture p1 = new Picture();
		p1.add(p);
		p1.add(new Rectangle());
		p1.draw();
	}
}
