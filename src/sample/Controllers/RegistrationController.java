package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import sample.DataBaseHandler;
import Constructors.User;

public class RegistrationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;



    @FXML
    private Button authSignInButton;

    @FXML
    private  TextField firstname_field;

    @FXML
    private TextField lastname_field;

    @FXML
    private TextField username_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private TextField mail_field;

    @FXML
    private RadioButton male_radiobutton;


    @FXML
    private MenuItem Exit;

    @FXML
    void initialize() {
        DataBaseHandler dbHandler = new DataBaseHandler();

        authSignInButton.setOnAction(event -> {
            signUpNewUser();

        });
    }

    private void signUpNewUser() {
        DataBaseHandler dbHandler = new DataBaseHandler();

        String firstName = firstname_field.getText();
        String lastName = lastname_field.getText();
        String userName = username_field.getText();
        String password = password_field.getText();
        String mail = mail_field.getText();
        String gender = "";
        if(male_radiobutton.isSelected())
            gender="Мужской";
        else
            gender= "Женский";

        User user = new User(firstName,lastName,userName,password,mail,gender);

        dbHandler.signUpUser(user);
    }
}