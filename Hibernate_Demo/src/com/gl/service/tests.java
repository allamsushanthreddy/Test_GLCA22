package com.gl.service;

import java.sql.Connection;
import java.sql.DriverManager;
public class tests {
	public static void main(String[] args) {
		String jdbc = "jdbc:mysql://local host:3306/order-directory";
		String user = "root";
		String pass = "root";
		try {
			System.out.println("jdbc url :" + jdbc);
			Connection myConn = DriverManager.getConnection(jdbc, user, pass);
			System.out.println("Coneection is successful");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
