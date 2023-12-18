
package com.jdbc.practice;
import java.sql.*;
import java.io.*;

public class UpdateUserInsert {
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3305/College","Roshani","1235");
        
        if(con.isClosed()){
            System.out.println("Connection closed");
}
        else{
            System.out.println("MADE");
        }
        
        String st = "Update student set Name=?, Address=? where id=?";
        
        PreparedStatement pstmt = con.prepareStatement(st);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
            System.out.print("Enter name:");
            String name = bf.readLine();
            
            System.out.print("Enter Address: ");
            String address = bf.readLine();
            
            System.out.print("Enter id: ");
            int id = Integer.parseInt(bf.readLine());
        
            pstmt.setString(1, name);
            pstmt.setString(2, address);
            pstmt.setInt(3, id);
            
            pstmt.executeUpdate();
            con.close();
}
    catch(Exception e){
    e.printStackTrace();
}
}
}