package prototype;

public abstract class AbstractFurniture implements Cloneable {
	
	public abstract void draw();

	// 在Design Pattern上，以下的clone是抽象未实作的
	// 实际上在Java中class都继承自Object
	// 所以在这边我们直接重新定义clone()
	// 这是为了符合Java现行的clone机制
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
