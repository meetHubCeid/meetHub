package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class ViewControllers {

    // register controller
    @FXML
    TextField usernameTxt;

    @FXML
    PasswordField passwordField;

    @FXML
    DatePicker datePicker;

    @FXML
    Toggle isMale;

    @FXML
    Toggle isFemale;

    @FXML
    Toggle isOther;

    @FXML
    Button registerBtn;

    @FXML
    ImageView imgView;

    @FXML
    Button randomBtn;


    @FXML
    Button QuizBtn;

    @FXML
    Button RoomBtn;

    @FXML
    Button BazzarBtn;

    @FXML
    Button KioskBtn;

    @FXML
    Button ChatroomBtn;

    @FXML
    Button NextBtn;

    @FXML
    Button GameZoneBtn;

    @FXML
    Button SnakesBtn;

    @FXML
    Button rollBtn;

    @FXML
    Label diceA;

    @FXML
    Label diceB;



    @FXML
    private void registerBtnClicked() throws IOException {

        String username = usernameTxt.getText();
        String password = passwordField.getText();
        LocalDate localdate = datePicker.getValue();
        Date date = new Date();
        boolean male = isMale.isSelected();
        boolean female = isFemale.isSelected();
        boolean other = isOther.isSelected();

        User user;

        if (male) {
            user = new User(username, password, date, 1, User.Gender.Male);
        } else if ( female) {
            user = new User(username, password, date, 1, User.Gender.Female);
        } else {
            user = new User(username, password, date, 1, User.Gender.Other);
        }

        meetHUBWorld.loggedinUsers.add(user);

        Stage currentWindow = (Stage) registerBtn.getScene().getWindow();
        currentWindow.close();

        Parent AvatarView = FXMLLoader.load(getClass().getResource("AvatarView.fxml"));
        Stage avatarStage = new Stage();
        avatarStage.setScene(new Scene(AvatarView, 900, 600));
        avatarStage.setTitle("Create your Avatar");
        avatarStage.show();

    }

    @FXML
    private void randomClicked()
    {
//        Image image = new Image("./logo.PNG");
//        imgView.setImage(image);

    }

    @FXML
    private void NextBtnClicked() throws IOException {


        Stage currentWindow = (Stage) NextBtn.getScene().getWindow();
        currentWindow.close();

        Parent AvatarView = FXMLLoader.load(getClass().getResource("meetHubWorldView.fxml"));
        Stage avatarStage = new Stage();
        avatarStage.setScene(new Scene(AvatarView, 900, 600));
        avatarStage.setTitle("Choose your Room");
        avatarStage.show();

    }

    @FXML
    private void GameZoneBtnClicked() throws IOException {


        Stage currentWindow = (Stage) GameZoneBtn.getScene().getWindow();
        currentWindow.close();

        Parent AvatarView = FXMLLoader.load(getClass().getResource("GameZoneView.fxml"));
        Stage avatarStage = new Stage();
        avatarStage.setScene(new Scene(AvatarView, 900, 600));
        avatarStage.setTitle("Choose your Room");
        avatarStage.show();
    }

    @FXML
    private void SnakesBtnClicked() throws IOException {

        Parent AvatarView = FXMLLoader.load(getClass().getResource("SnakeLaddersView.fxml"));
        Stage avatarStage = new Stage();
        avatarStage.setScene(new Scene(AvatarView, 900, 600));
        avatarStage.setTitle("Choose your Room");
        avatarStage.show();


    }

    @FXML
    private void rollBtnClicked() throws IOException
    {
        Dice dice = new Dice();
        dice.rollTheDice(1,6);

        diceA.setText(String.valueOf(dice.numberA));
        diceB.setText(String.valueOf(dice.numberB));

    }

}
