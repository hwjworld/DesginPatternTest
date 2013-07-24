package producerConsumer;

import java.util.LinkedList;

public class ProductTable {

	private LinkedList products = new LinkedList();

	public synchronized void addProduct(Product product) {
		while (products.size() >= 2) { // 容量限制为 2
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}

		products.addLast(product);
		notifyAll();
	}

	public synchronized Product getProduct() {
		while (products.size() <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}

		Product product = (Product) products.removeFirst();
		notifyAll();

		return product;
	}

	// -----------------------上面是单独的例子，因例子与此类重名，故所用方法放在下面

	private int productInt = -1; // -1 for no product

	public synchronized void setIntProduct(int product) {
		if (productInt != -1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		productInt = product;
		System.out.println("set (" + product + ")");
		notify();
	}

	public synchronized int getProductInt() {
		if (productInt == -1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		int p = productInt;
		System.out.println("Get (" + productInt + ")");
		productInt = -1;

		notify();

		return p;
	}
}

class Product {

}