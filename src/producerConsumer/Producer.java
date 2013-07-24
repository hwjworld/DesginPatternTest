package producerConsumer;

public class Producer extends Thread {

	private ProductTable productTable;

	public Producer(ProductTable productTable) {
		this.productTable = productTable;
	}

	public void run() {
		System.out.println("Produce integer......");
		for (int product = 1; product <= 10; product++) {
			try {
				// wait for a random time
				Thread.sleep((int) Math.random() * 3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			productTable.setIntProduct(product);
		}
	}
}
