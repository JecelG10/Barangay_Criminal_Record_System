
package Guinita;

import java.sql.*;

public class Database {


    private static final String host = "jdbc:mysql://localhost:3600/crime";
    public static final String user ="root";
    private static final String password = "";
    public static final String database= "crime";
    
    private static Connection connect(){
        try{
            return DriverManager.getConnection(host, user, password);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    public static Connection oldConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(host, user, password);
         
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    }
   
    

