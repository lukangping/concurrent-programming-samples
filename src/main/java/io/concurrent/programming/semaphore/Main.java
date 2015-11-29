package io.concurrent.programming.semaphore;

/**
 * Created by roger.lu on 15/11/28.
 */
public class Main {


    public static void main(String[] args) {

        PrintQueue printQueue = new PrintQueue();

        for(int i=0; i<10; i++){
            Thread thread = new Thread(new Job(printQueue));
            thread.start();
        }

    }


}
