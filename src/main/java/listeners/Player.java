package listeners;

public class Player{

    Trackable trackable;

    public Player(Trackable trackable) {
        this.trackable = trackable;
    }

    public void makeAFoul(){
        trackable.trackFoul();
    }
}
