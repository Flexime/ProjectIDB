package sample;

import java.sql.*;
public class DataBaseHandler extends Configs {
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException,SQLException{
        String connectionString = "jdbc:mysql://"
                +dbHost+":" +dbPrort +"/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");

        dbConnection =DriverManager.getConnection(connectionString,
                dbUser,dbPass);
        return  dbConnection;
    }
    public void signUpUser(String first_name,String last_name,String username ,
                           String password,String mail){
        String insert = "INSERT INTO "
                +Const.USER_TABLE+"(" + Const.USER_FIRST_NAME + ","
                +Const.USER_LAST_NAME +"," +Const.USER_NAME+ Const.USER_MAIL + ")"+
                "VALUES(?,?,?,?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1,first_name);
            prSt.setString(1,last_name);
            prSt.setString(1,mail);
            prSt.setString(1,username);
            prSt.setString(1,password);

            prSt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}