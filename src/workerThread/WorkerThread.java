package workerThread;

/**
 * Worker Thread模式在Request的管理上像是 Producer Consumer 模式，在Request的行为上像是 Command 模式。
 * 没有实现 command
 * 
 * @author Administrator
 * 
 */
public class WorkerThread extends Thread {

	// ...
	private static Channel channel = new Channel(5);

	public void run() {
		while (true) {
			Request request = channel.getRequest();
			request.execute();
		}
	}
}
