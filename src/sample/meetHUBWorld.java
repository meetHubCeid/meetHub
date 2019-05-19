package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class meetHUBWorld {
    static List<User> loggedinUsers = new ArrayList<User>();
    static List<meetHUBRoom> rooms = new ArrayList<meetHUBRoom>();

    meethubKiosk meethubKiosk;
    meetHUBbazaar meetHUBbazaar;
    Quiz quiz;
    GameZone gameZone;
    Chatroom chatroom;


    static void logIn(User user) {
        loggedinUsers.add(user);
    }

    static void logOut(User user) {
        loggedinUsers.remove(user);
    }

    public meetHUBRoom selectRoom(int roomID)
    {
        int pos = -1;
        for (int i = 0; i <rooms.size(); i++)
            if (rooms.get(i).id == roomID)
            {
                pos = i;
                break;
            }

        return rooms.get(pos);
    }

    @FXML
    public void NextBtnClicked() throws Exception {

        Parent registerView = FXMLLoader.load(getClass().getResource("meetHubWorldView.fxml"));
        Stage registerStage = new Stage();
        registerStage.setScene(new Scene(registerView, 260, 340));
        registerStage.setTitle("Choose Room");
        registerStage.show();

    }
}
