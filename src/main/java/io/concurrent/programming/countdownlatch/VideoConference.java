package io.concurrent.programming.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by roger.lu on 15/11/29.
 */
public class VideoConference implements Runnable{

    private CountDownLatch countDownLatch;
    private int number;

    public VideoConference(int number) {
        countDownLatch = new CountDownLatch(number);
    }

    public void arrive(String name) {
        countDownLatch.countDown();
        System.out.println(name + " in.");
    }


    @Override
    public void run() {
        try {
            System.out.println("Waiting for participants...");
            countDownLatch.await();
            System.out.printf("All participants are in. Let's start.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
