package factoryMethod;

/**
 * Factory
 * Method中的AbstractOperator中拥有一个抽象的factoryMethod()方法，它负责生成一个IProduct类型的物件，由
 * 于目前还不知道将如何实现这个类型，所以将之推迟至子类别中实现，在AbstractOperator中先实现IProduct操作介面沟通的部份，只要
 * 介面统一了，利用多型操作即可完成各种不同的IProduct类型之物件操作。
 * 
 * 也就是说，对AbstractOperator来说，其操作的IProduct是可以抽换的。
 * 
 * @author Administrator
 * 
 */
public class Main {
	public static void main(String[] args) {
		RTFEditor rf = new RTFEditor();
		rf.newDocument();
		rf.saveDocument();
		rf.closeDocument();

	}
}
