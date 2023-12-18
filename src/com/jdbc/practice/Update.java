
package com.jdbc.practice;
import java.sql.*;
public class Update {
    public static void main(String[] args) {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3305/College","Roshani","1235");
            
            if(con.isClosed()){
                System.out.println("Conntection closed");
            }
            
            else{
                System.out.println("Created");
            }
            
            String st = "Update Student set Name=? , Address=? where id=?";
            PreparedStatement stmt =  con.prepareStatement(st);
            stmt.setString(1,"Cholu kun");
            stmt.setString(2,"Bangalore");
            stmt.setInt(3, 1);
            
            stmt.executeUpdate();
            
            System.out.println("Updated");
    }
        
        catch(Exception e){
             e.printStackTrace();
        }
}
}
