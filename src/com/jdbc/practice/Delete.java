package com.jdbc.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Delete {

	public static void main(String args[]) {
		try {
			Connection con = connectionProvider.getConnection();
			String query = "Delete from student where id =?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, 1);
			if (pstmt.executeUpdate() == 1) {
				System.out.println("Deleted");
			} else {
				System.out.println("Not Deleted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}