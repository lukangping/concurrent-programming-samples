package io.concurrent.programming.semaphore;

/**
 * Created by roger.lu on 15/11/28.
 */
public class Job implements Runnable{

    private PrintQueue printQueue;

    public Job(PrintQueue printQueue) {
        this.printQueue = printQueue;
    }

    @Override
    public void run() {
        printQueue.print();
    }
}
