package sample;

public class VideoRoom extends Chatroom {

    private User caller;
    private User receiver;

    public VideoRoom(User caller, User receiver) {
        this.caller = caller;
        this.receiver = receiver;
    }

    public VideoRoom(){

    }

    public User getCaller() {
        return caller;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setCaller(User caller) {
        this.caller = caller;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }
}
