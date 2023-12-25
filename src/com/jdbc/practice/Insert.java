package com.jdbc.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Insert {

	public static void main(String[] args) {
		try {
			Connection con = connectionProvider.getConnection();
			String query = "insert into Student (id,name, address) values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter id: ");
			int id = Integer.parseInt(bf.readLine());

			System.out.print("Enter name:");
			String name = bf.readLine();

			System.out.print("Enter Address: ");
			String address = bf.readLine();

			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, address);

			if (pstmt.executeUpdate() == 1) {
				System.out.println("Data Inserted");
			} else {
				System.out.println("Data not inserted");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
