package wikipattern;

import java.util.HashMap;
import java.util.Map;

import sun.security.pkcs11.wrapper.Constants;

enum FRUIT_TYPE{
	NONE,
	APPLE,
	BANANA
}

class Fruit{
	private static Map<FRUIT_TYPE, Fruit> types = new HashMap<FRUIT_TYPE, Fruit>();
	private FRUIT_TYPE t;
	private Fruit(FRUIT_TYPE type) {
		t = type;
	}
	public static Fruit getFruitByTypeName(FRUIT_TYPE type){
		Fruit fruit;
		if(!types.containsKey(type)){
			fruit = new Fruit(type);
			types.put(type, fruit);
		}else{
			fruit = types.get(type);
		}
		return fruit;
	}
	public static Fruit getFruitByTypeNameHighConcurrentVersion(FRUIT_TYPE type){
		if(!types.containsKey(type)){
			synchronized (types) {
				if(!types.containsKey(type)){
					types.put(type, new Fruit(type));
				}
			}
		}
		return types.get(type);
	}
	public static void showAll(){
		if(types.size()>0){
			System.out.println("Number of instance made = "+types.size());
			for (Fruit iterable_element : types.values()) {
				System.out.println(iterable_element.toString());
			}
		}
	}
	@Override
	public String toString() {
		return "Fruit ["+t+"]";
	}
}
public class LazyInitialization {
	public static void main(String[] args) {
		Fruit.showAll();
		Fruit.getFruitByTypeNameHighConcurrentVersion(FRUIT_TYPE.BANANA);
		Fruit.showAll();
		Fruit.getFruitByTypeNameHighConcurrentVersion(FRUIT_TYPE.APPLE);
		Fruit.showAll();
		Fruit.getFruitByTypeNameHighConcurrentVersion(FRUIT_TYPE.BANANA);
		Fruit.showAll();
	}
}
