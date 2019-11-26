package sample;

import Constructors.ClientTable;
import Constructors.Clientb;
import Constructors.User;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;
public class DataBaseHandler extends Configs {
    private static  Connection  dbConnection;

    public  Connection getDbConnection() throws ClassNotFoundException,SQLException{
        String connectionString = "jdbc:mysql://"
                +dbHost+":" +dbPrort +"/" + dbName+"?serverTimezone=UTC";
        Class.forName("com.mysql.jdbc.Driver");

        try {
            dbConnection =DriverManager.getConnection(connectionString, dbUser,dbPass);

             if (!dbConnection.isClosed()){
                 System.out.println("Connected to MYSQL DB");
             }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return  dbConnection;
    }

    public  void insertClient(Clientb client) {


        String insert = "INSERT INTO" + "(" + Const.CLIENT_TABLE + "," + Const.CLIENT_COMPANY +
                "," + Const.CLIENT_FIRST_NAME + "," + Const.CLIENT_LAST_NAME +
                "," + Const.CLIENT_PNUMBER + "," + Const.CLIENT_CDATE +
                "," + Const.CLIENT_SDATE + "," + Const.CLIENT_EDATE +
                "," + Const.CLIENT_SUMM + ")" + "VALUES(?,?,?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, client.getCompany());
            prSt.setString(2, client.getFirst_name());
            prSt.setString(3, client.getLast_name());
            prSt.setString(4, client.getPnumber());
            prSt.setString(5, client.getPnumber());
            prSt.setString(6, client.getStartDate());
            prSt.setString(7, client.getEndDate());
            prSt.setString(8, client.getStartDate());

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void signUpUser(User user){
        String insert = "INSERT INTO "
                +Const.USER_TABLE+"(" + Const.USER_FIRST_NAME + ","
                +Const.USER_LAST_NAME +"," + Const.USER_NAME+ Const.USER_MAIL +
                Const.USER_PASSWORD + Const.USER_GENDER+")"+
                "VALUES(?,?,?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1,user.getFirstName());
            prSt.setString(2,user.getLastName());
            prSt.setString(3,user.getUserName());
            prSt.setString(4,user.getPassword());
            prSt.setString(5,user.getMail());
            prSt.setString(6,user.getGender());


            prSt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public ResultSet getUser(User user){
        ResultSet resultSet =null;
        String select = "SELECT*FROM " + Const.USER_TABLE +" WHERE "+
                Const.USER_NAME +" =? AND " +Const.USER_PASSWORD +" =? ";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1,user.getUserName());
            prSt.setString(2,user.getPassword());

            resultSet =  prSt.executeQuery();
        }catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

  public  ObservableList<ClientTable> TableContext(ClientTable table){
        ResultSet resSet = null;
        String select ="SELECT * FROM"+Const.CLIENT_TABLE;
        try{

           PreparedStatement prSt = getDbConnection().prepareStatement(select);
          ObservableList<ClientTable> tablelist = getClientObject((ResultSet) prSt);
        }
        catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
  }
        return (ObservableList<ClientTable>) table;
 }

    private ObservableList<ClientTable> getClientObject(ResultSet resSet) {

        try {
            ObservableList<ClientTable> tablelist = FXCollections.observableArrayList();

            while (resSet.next()){
           /**    ClientTable tab = new ClientTable();
                tab.setCompany(resSet.getString("company"));
                tab.setFirst_name(resSet.getString("first_name"));
                tab.setLast_name("last_name");
                tab.setPnumber("pnumber");
                tab.setCreationDate("cretionDate");
                tab.setStartDate("StartDate");
                tab.setEndDate("EndDate");
                tab.setSumm("summ");
                tablelist.add(tab);*/
            }
            return tablelist;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }



    public void deleteClientDB(String firstname,String lastname) {
        String delete = "DELETE FROM" + Const.CLIENT_TABLE + "WHERE" +
                "first_name" + "=" + Const.CLIENT_FIRST_NAME +
                "AND" +
                "last_name" + "=" + Const.CLIENT_LAST_NAME;

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(delete);
//            prSt.setString(1, client.getFirst_name());
//            prSt.setString(2, client.getLast_name());

             prSt.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}