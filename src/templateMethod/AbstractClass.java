package templateMethod;

/**
 * 仅仅是抽象类别与具体类别实作的关系而已，有些人常问抽象类别与介面的区别为何，Template Method模式可以提供其中一个答案
 * 
 * Factyro Method模式将实际要创建的物件推迟至子类中决定，而 Template
 * Method模式则是将流程框架的实作留待子类来解决，事实上在这个例子中，您也可以将createDocument()看作是Template
 * Method模式中的一个方法，从物件创建的角度来看它是Factory Method，而从流程框架的角度来看，它则是Template
 * Method模式的一个方法实作。
 * 
 * @author Administrator
 * 
 */
public abstract class AbstractClass {
	public void templateMethod() {
		// step by step template to solve something
		// implementor should follow those step
		opStep1();
		opStep2();
		opStep3();
	}

	public abstract void opStep1();

	public abstract void opStep2();

	public abstract void opStep3();
}