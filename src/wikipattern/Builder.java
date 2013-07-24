package wikipattern;



class Pizza{
	private String dough = "";
	private String sauce = "";
	private String topping = "";
	public void setDough(String dough) {
		this.dough = dough;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	@Override
	public String toString() {
		return "Pizza [dough=" + dough + ", sauce=" + sauce + ", topping="
				+ topping + "]";
	}
	
}
abstract class PizzaBuilder{
	protected Pizza pizza;
	public Pizza getPizza(){
		return pizza;
	}
	public void createNewPizzaProduct(){
		pizza = new Pizza();
	}
	public abstract void buildDough();
	public abstract void buildSauce();
	public abstract void buildTopping();
}
class HawaiianPizzaBuilder extends PizzaBuilder{

	@Override
	public void buildDough() {
		pizza.setDough("cross");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("mild");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("ham+pineapple");
	}
	
}
class SpicyPizzaBuilder extends PizzaBuilder{

	@Override
	public void buildDough() {
		pizza.setDough("pan baked");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("hot");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("pepperoni+salami");
	}
	
}

class Waiter{
	private PizzaBuilder pizzaBuilder;
	public void setPizzaBuilder(PizzaBuilder builder){
		pizzaBuilder = builder;
	}
	public void constructPizza(){
		pizzaBuilder.createNewPizzaProduct();
		pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();
	}
	public Pizza getPizza(){
		return pizzaBuilder.getPizza();
	}
}
public class Builder {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		waiter.setPizzaBuilder(new SpicyPizzaBuilder());
		waiter.constructPizza();
		Pizza pizza = waiter.getPizza();
		System.out.println(pizza);
	}
}
