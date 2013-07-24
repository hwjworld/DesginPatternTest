package readWriteLock;

public class Lock {

	 private boolean writerFirst = true; // 写入优先
	 private int writingWriters = 0;
	 private int waitingWriters = 0;
	 private int readingReaders = 0;
	 public synchronized void readLock() {
	    try {
	        while(writingWriters > 0 || 
	                   (writerFirst && waitingWriters > 0)) {
	            wait();
	        }
	    }
	    catch(InterruptedException e) {
	    }

	    readingReaders++;
	 }
	 
	 public synchronized void readUnLock() {
	    readingReaders--;
	    writerFirst = true;
	    notifyAll();
	 }
	 
	 public synchronized void writeLock() {
	    waitingWriters++;
	    try {
	        while(readingReaders > 0 || writingWriters > 0) {
	            wait();
	        }
	    }
	    catch(InterruptedException e) {
	    }
	    finally {
	        waitingWriters--;
	    }

	    writingWriters++;
	 }
	 
	 public synchronized void writeUnLock() {
	    writingWriters--;
	    writerFirst = false;
	    notifyAll();
	 } 
}
