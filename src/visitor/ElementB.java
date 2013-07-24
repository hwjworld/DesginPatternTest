package visitor;

public class ElementB implements IElement {

	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	public void operationB() {
		System.out.println("do B's job....such-and-such....");
	}
}
