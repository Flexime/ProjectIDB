package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.mysql.cj.xdevapi.SqlDataResult;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class RegistrationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    //SIGN UP buttons //

    @FXML
    private TextField login_field;
    @FXML
    private PasswordField password_field;
    @FXML
    private Button authSignInButton;
    @FXML
    private  TextField signUpFirstName;
    @FXML
    private TextField signUpLastName;
    @FXML
    private CheckBox signUpCheckBoxMale;
    @FXML
    private TextField mail_field;


    //login buttons

    @FXML
    private Button loginSignUpButton;

    @FXML
    private TextField login_field1;

    @FXML
    private TextField login_field11;

    @FXML
    private TextField login_field111;

    @FXML
    private TextField login_field1111;

    @FXML
    private PasswordField password_field1;

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

        String firstName = signUpFirstName.getText();
        String lastName = signUpLastName.getText();
        String userName = login_field.getText();
        String password = password_field.getText();
        String mail = mail_field.getText();
        String gender = "";
        if(signUpCheckBoxMale.isSelected())
            gender="Мужской";
        else
            gender= "Женский";

        User user = new User(firstName,lastName,userName,password,mail,gender);

        dbHandler.signUpUser(user);
    }
}