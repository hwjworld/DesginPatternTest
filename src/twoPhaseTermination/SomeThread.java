package twoPhaseTermination;

public class SomeThread {

    private boolean isTerminated = false;

    public void terminate() {
        isTerminated = true;
        interrupt();
    }

    public boolean isTerminated() {
        return _isTerminated;
    }

    private void doWorkBeforeShutdown() {
        // .... do some work before shutdown
    }

    public void run() {
        try {
            while(!_isTerminated) {
                // ... some statements
            }
        }
        catch(InterruptedException e) {
        }
        finally {
            doWorkBeforeShutdown();
        }
    }
}
