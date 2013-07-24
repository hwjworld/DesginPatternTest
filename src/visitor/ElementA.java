package visitor;

public class ElementA implements IElement {

	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	public void operationA() {
		System.out.println("do A's job....such-and-such....");
	}
}
