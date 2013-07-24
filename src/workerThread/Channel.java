package workerThread;

import java.util.LinkedList;

public class Channel {

	private LinkedList requests;
	private WorkerThread[] workerThreads;

	public Channel(int threadNumber) {
		requests = new LinkedList();
		workerThreads = new WorkerThread[threadNumber];
		for (int i = 0; i < workerThreads.length; i++) {
			workerThreads[i] = new WorkerThread();
			workerThreads[i].start();
		}
	}

	public synchronized void putRequest(Request request) {
		while (requests.size() >= 2) { // 容量限制为 2
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}

		requests.addLast(request);
		notifyAll();
	}

	public synchronized Request getRequest() {
		while (requests.size() <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}

		Request request = (Request) requests.removeFirst();
		notifyAll();

		return request;
	}
}
