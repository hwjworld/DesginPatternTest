package threadSpecificStorage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 可以使用java.lang.ThreadLocal来实 现Thread- Specific Storage模式，以获得更好的效能
 * @author Administrator
 *
 */
public class ThreadLocal {

	private Map storage = Collections.synchronizedMap(new HashMap());

	public Object get() {
		Thread current = Thread.currentThread();
		Object o = storage.get(current);

		if (o == null && !storage.containsKey(current)) {
			o = initialValue();
			storage.put(current, o);
		}

		return o;
	}

	public void set(Object o) {
		storage.put(Thread.currentThread(), o);
	}

	public Object initialValue() {
		return null;
	}
}
