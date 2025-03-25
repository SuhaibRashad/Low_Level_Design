package BehaviouralPatterns.StatePattern.MediaPlayer;


public interface State {
    void pressPlay();
    void pressStop();
    void pressPause();
    void display();
}