package guardedSuspension;

public class RequestQueue {

	private java.util.LinkedList queue;

	public RequestQueue() {
		queue = new java.util.LinkedList();
	}

	public synchronized Request getRequest() {
		while (queue.size() <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		return (Request) queue.removeFirst();
	}

	public synchronized void putRequest(Request request) {
		queue.addLast(request);
		notifyAll();
	}
}
class Request{
}
