package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import Constructors.Clientb;
import sample.DataBaseHandler;

public class HomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem Exit;

    @FXML
    private MenuButton menuButton;

    @FXML
    private MenuItem menuSettings;

    @FXML
    private MenuItem menuLogOut;

    @FXML
    private TableView<?> mainInfoTable;

    @FXML
    private TableColumn<?, ?> MIT_id;

    @FXML
    private TableColumn<?, ?> MIT_company;

    @FXML
    private TableColumn<?, ?> MIT_first_name;

    @FXML
    private TableColumn<?, ?> MIT_last_name;

    @FXML
    private TableColumn<?, ?> MIT_phone_number;

    @FXML
    private TableColumn<?, ?> MIT_creation_date;

    @FXML
    private TableColumn<?, ?> MIT_start_date;

    @FXML
    private TableColumn<?, ?> MIT_end_date;

    @FXML
    private TableColumn<?, ?> MIT_summ;


    @FXML
    private Button delete_button;

    @FXML
    private Button search_button;

    @FXML
    private Button add_button;

    @FXML
    private Button update_button;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    private TextField MIT2_id;

    @FXML
    private TextField MIT2_company;

    @FXML
    private TextField MIT2_first_name;

    @FXML
    private TextField MIT2_last_name;

    @FXML
    private TextField MIT2_phone_number;

    @FXML
    private TextField MIT2_start_date;

    @FXML
    private TextField MIT2_creation_name;

    @FXML
    private TextField MIT2_end_date;

    @FXML
    private TextField MIT2_summ;

    @FXML
    void initialize() {
        add_button.setOnAction(event -> {
            insertClient();
        });

        delete_button.setOnAction(event -> {
            String firstname = MIT2_first_name.getText().trim();
            String lastname = MIT2_last_name.getText().trim();

            if (!firstname.equals("") && !lastname.equals("")){
                deleteClient(firstname, lastname);
            }
                else {
                System.out.println("CLIENT NOT FOUND");
            }
        });

        update_button.setOnAction(event -> {

        });
    }

    
    private  void insertClient(){
        DataBaseHandler dbHandler = new DataBaseHandler();
       String company = MIT2_company.getText();
       String first_name = MIT2_first_name.getText();
       String  last_name = MIT2_last_name.getText();
       String pnumber = MIT2_phone_number.getText();
       String creationDate = MIT2_creation_name.getText();
       String Start_date = MIT2_start_date.getText();
       String endDate = MIT2_end_date.getText();
       String summ = MIT2_summ.getText();

        Clientb client = new Clientb(company,first_name,last_name,pnumber,creationDate,Start_date,endDate,summ);

        dbHandler.insertClient(client);
    }

    private void deleteClient(String firstname,String lastname){
        DataBaseHandler dbHandler = new DataBaseHandler();
        dbHandler.deleteClientDB(firstname,lastname);
    }

}

