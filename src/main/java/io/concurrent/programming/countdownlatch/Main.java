package io.concurrent.programming.countdownlatch;

/**
 * Created by roger.lu on 15/11/29.
 */
public class Main {

    public static void main(String[] args) {

        VideoConference videoConference = new VideoConference(10);
        Thread conference = new Thread(videoConference);
        conference.start();

        for(int i=0; i<10; i++){
            Thread thread = new Thread(new Participant(videoConference, "participant" + i));
            thread.start();
        }

    }

}
