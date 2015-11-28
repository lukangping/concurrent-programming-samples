package io.concurrent.programming;

import java.util.concurrent.Semaphore;

/**
 * Created by roger.lu on 15/11/28.
 */
public class PrintQueue {

    private Semaphore semaphore = new Semaphore(1);

    public void print(){
        try {
            semaphore.acquire();
            System.out.printf(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

}
