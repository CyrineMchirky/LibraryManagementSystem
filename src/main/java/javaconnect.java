/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cyrine
 */
import java.sql.*;

public class javaconnect {
   
    public static Connection ConnecrDb(){
        try {
        
        Connection conn  = DriverManager.getConnection("jdbc:derby://localhost:1527/Library_System", "Cyrine","Cyrine");
        System.out.println("Connection Successful");
        return conn ;
        }
        catch (Exception e){
        System.out.println("Connection Failed"+ e);
        return null ;
}

}  
}
