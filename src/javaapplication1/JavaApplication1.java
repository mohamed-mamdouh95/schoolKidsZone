/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Administrator
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {

		try {

			Connection conn = DriverManager
					.getConnection("jdbc:ucanaccess://C:\\Users\\administrator.EMODLI\\Documents\\schoolKidsZone.accdb");
			Statement stment = conn.createStatement();
			String qry = "SELECT * FROM Table1";

			ResultSet rs = stment.executeQuery(qry);
			if (rs.next()) {
				
				System.out.println(rs.getString(2));
			}
			
		} catch (Exception err) {
			System.out.println(err);
		} 

		// System.out.println("Hasith Sithila");

	}
}
