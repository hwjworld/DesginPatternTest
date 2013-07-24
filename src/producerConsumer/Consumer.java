package producerConsumer;

public class Consumer extends Thread {

	private ProductTable productTable;

	public Consumer(ProductTable productTable) {
		this.productTable = productTable;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				// wait for a random time
				Thread.sleep((int) (Math.random() * 3000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			productTable.getProductInt();
		}
	}
}
