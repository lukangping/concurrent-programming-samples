package io.concurrent.programming.countdownlatch;

/**
 * Created by roger.lu on 15/11/29.
 */
public class Participant implements Runnable{

    private String name;
    private VideoConference videoConference;

    public Participant(VideoConference videoConference, String name) {
        this.name = name;
        this.videoConference = videoConference;
    }

    @Override
    public void run() {
        videoConference.arrive(name);

    }
}
