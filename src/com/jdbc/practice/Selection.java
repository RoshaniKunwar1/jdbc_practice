package com.jdbc.practice;

import java.sql.*;

public class Selection {

    public static void main(String[] args) {
        try {
Connection con = connectionProvider.getConnection();

String st = "Select * from Student";
Statement stmt = con.createStatement();
ResultSet set = stmt.executeQuery(st);

while(set.next()==true){
    int id = set.getInt(1);
    String name =set.getString("Name");
    String Add = set.getString("Address");
    
    System.out.println("Id: "+id);
    System.out.println("Name: "+ name);
    System.out.println("Address: "+Add);
    System.out.println("\n");
}
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
