package threadLearning;

public class ThreadState implements Runnable {

  public synchronized void waitForAMoment() throws InterruptedException {
    wait(500);
  }

  public synchronized void waitForever() throws InterruptedException {
    wait();
  }

  public synchronized void notifyNow() throws InterruptedException {
    notify();
  }

  @Override
  public void run() {
    try {
      waitForAMoment();
      waitForever();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
