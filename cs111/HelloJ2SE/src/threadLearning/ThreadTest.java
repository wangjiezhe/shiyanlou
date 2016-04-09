package threadLearning;

public class ThreadTest {

  public static void main(String[] args) throws InterruptedException {

    ThreadState state = new ThreadState();
    Thread thread = new Thread(state);
    System.out.println("Create new thread: " + thread.getState());

    thread.start();
    System.out.println("Start the thread: " + thread.getState());

    Thread.sleep(1000);
    System.out.println("Wait for a moment: " + thread.getState());

    state.notifyNow();
    System.out.println("Wake up the thread: " + thread.getState());

    Thread.sleep(1000);
    System.out.println("Terminate the thread: " + thread.getState());
  }

}
