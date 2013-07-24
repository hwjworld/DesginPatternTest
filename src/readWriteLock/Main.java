package readWriteLock;

/**
 * 其中writerFirst是写入优先的旗标，它确保只要有写入的执行绪在等待时，在解除锁定的时候，可以优先由写入执行绪取得锁定，以确保读取者读取到
 * 的资料可以是最新的，但缺点就是写入的动作很频繁时，读取者必须等待的机会将增多，相反的若设定为读取优先，则读取时的回应性会增高，但资料更新的速率将
 * 会下降，实际使用时要偏好哪一方，必须视应用的场合而定。
 * 
 * @author Administrator
 * 
 */
public class Main {
	private Lock lock = new Lock();

	public void readData() {
		lock.readLock();
		// doRead();
		System.out.print("doRead");
		lock.readUnLock();
	}

	public void writeData() {
		lock.writeLock();
		System.out.print("doWrite");
		lock.writeUnLock();
	}
}
