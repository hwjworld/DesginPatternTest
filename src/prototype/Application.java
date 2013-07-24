package prototype;

import java.awt.Point;

/**
 * 您从图书馆的期刊从发现了几篇您感兴趣的文章，由于这是图书馆的书，您不可以直接在书中作记号或写字，所以您将当中您所感兴趣的几个主题影印出来，
 * 这下子您就可在影印的文章上画记重点。
 * 
 * Prototype模式的作用有些类似上面的描述，您在父类别中定义一个clone()方法，而在子类别中重新定义它，当客户端对于所产生的物件有兴趣并想加以利用
 * ，而您又不想破坏原来的物件，您可以产生一个物件的复本给它。
 * 
 * Prototype具有展示的意味，就像是展览会上的原型车款，当您对某个车款感兴趣时，您可以购买相同款示的车，而不是车展上的车。
 * 
 * 在软体设计上的例子会更清楚的说明为何要进行物件复制，假设您要设计一个室内设计软体，软体中有一个展示家具的工具列，您只要点选工具列就可以产生一个家
 * 具复本，例如一张椅子或桌子，您可以拖曳这个复制的物件至设计图中，随时改变它的位置、颜色等等，当您改变设计图中的物件时，工具列上的原型工具列是不会
 * 跟着一起改变的，这个道理是无需解释的。
 * 
 * 
 * 
 * 思考了与new 有何不同 如果车展上的车有红，白，new 出来的是白色的，setColor(red)之后才变红 这时要红的车就只能clone了，new
 * 出来的不符合要求
 * 
 * @author Administrator
 * 
 */
public class Application {

	private AbstractFurniture circleTablePrototype;

	public void setCircleTablePrototype(AbstractFurniture circleTablePrototype) {

		this.circleTablePrototype = circleTablePrototype;
	}

	public void runAppExample() throws Exception {
		House house = new House();
		CircleTable circleTable = null;

		// 从工具列选择一个家具加入房子中
		circleTable = (CircleTable) circleTablePrototype.clone();
		circleTable.setCenter(new Point(10, 10));
		house.addFurniture(circleTable);

		// 从工具列选择一个家具加入房子中
		circleTable = (CircleTable) circleTablePrototype.clone();
		circleTable.setCenter(new Point(20, 30));
		house.addFurniture(circleTable);
	}

	public static void main(String[] args) throws Exception {
		Application application = new Application();
		application.setCircleTablePrototype(new CircleTable());
		application.runAppExample();
	}
}
