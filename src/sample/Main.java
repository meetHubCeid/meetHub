package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    String username = "admin";
    String password = "1234";


    @FXML
    TextField usernameTxt;

    @FXML
    PasswordField passwordTxt;

    @FXML
    Button signInBtn;

    @FXML
    Button registerBtn;

    @FXML
    Button NextBtn;


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("meetHUB");
        primaryStage.setScene(new Scene(root, 490, 270));
        primaryStage.show();

    }

    @FXML
    public void signInBtnClicked() throws Exception {

        if (usernameTxt.getText().equals(username) && passwordTxt.getText().equals(password))
        {
            Parent worldView = FXMLLoader.load(getClass().getResource("meetHubWorldView.fxml"));
            Stage currentWindow = (Stage) signInBtn.getScene().getWindow();
            currentWindow.setScene(new Scene(worldView, 900, 600));
            currentWindow.setTitle("Welcome to MeetHUB World!");




        } else
        {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Something went wrong", ButtonType.CANCEL);
            alert.showAndWait();

        }



    }

    @FXML
    public void registerBtnClicked() throws Exception {

        Parent registerView = FXMLLoader.load(getClass().getResource("RegisterView.fxml"));
        Stage registerStage = new Stage();
        registerStage.setScene(new Scene(registerView, 260, 340));
        registerStage.setTitle("Register to meetHUB");
        registerStage.show();

    }

    @FXML
    private void registerBtnClicked1() throws IOException {

        if (usernameTxt.getText().equals(username) && passwordTxt.getText().equals(password)) {
            System.out.println("success");

            Stage currentWindow = (Stage) registerBtn.getScene().getWindow();
            currentWindow.close();

            Parent AvatarView = FXMLLoader.load(getClass().getResource("meetHubWorld.fxml"));
            Stage avatarStage = new Stage();
            avatarStage.setScene(new Scene(AvatarView, 900, 600));
            avatarStage.setTitle("Create your Avatar");
            avatarStage.show();



        } else
        {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Something went wrong", ButtonType.CANCEL);
            alert.showAndWait();

        }


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


    public static void main(String[] args) {
        launch(args);
    }
}
