

package com.jdbc.practice;

import java.io.*;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        try{
            Connection c = connectionProvider.getConnection();
            String st= "insert into images(pic) values(?)";
            System.out.println("THIS IS TESTING");
           PreparedStatement pstmt = c.prepareStatement(st);
           JFileChooser jf = new JFileChooser();    // directory file bata choose garna help
           
           jf.showOpenDialog(null);
           
           File file = jf.getSelectedFile();
           
            FileInputStream fis = new FileInputStream(file);
            
            pstmt.setBinaryStream(1, fis, fis.available());
            
            pstmt.executeUpdate();
            
            System.out.println("Done");
        
            JOptionPane.showMessageDialog(null,"success");
        }
        catch(Exception e){
            e.printStackTrace();
        }}
}