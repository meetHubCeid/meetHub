package sample;

import java.io.File;

public class MessageRoom  extends Chatroom{

    private String text;
    private String emoji;
    private User sender;
    private User receiver;
    private File file;

    public MessageRoom(String text, String emoji, User sender, User receiver, File file) {
        this.text = text;
        this.emoji = emoji;
        this.sender = sender;
        this.receiver = receiver;
        this.file = file;
    }

    public MessageRoom(){

    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public void add() {
    }

    public void returnAnswer() {
    }

    public void checkPoints() {
    }

    public void showMessage() {
    }

    public void deleteAll() {
    }

}
