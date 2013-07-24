package visitor;

public class ElementC implements IElement {

	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	public void operationC() {
		System.out.println("do C's job....such-and-such....");
	}
}
