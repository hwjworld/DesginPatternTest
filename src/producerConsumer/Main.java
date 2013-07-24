package producerConsumer;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		ProductTable table = new ProductTable();
		Producer p = new Producer(table);
		Consumer c = new Consumer(table);
		c.start();
		Thread.sleep(3000);
		p.start();
	}
}
