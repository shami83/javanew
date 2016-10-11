package com.example.imageutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

public class JDBCManager {
	
	private static JDBCManager instance = new JDBCManager();
	private Connection con=null;
	private final String CON_PARAM = "jdbc:mysql://localhost:3306/testdb";
	
	private JDBCManager()
	{
		
	}
	
	public  static  JDBCManager get()
	{
		return instance;
	}
	
	public JDBCManager connection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		con =  DriverManager.getConnection(CON_PARAM, "root", "mysql");
		System.out.println("Establish connetion successfully");
		
		return this;
	}
	
	public JDBCManager executeInsertQuery(String query,FileInputStream fin) throws SQLException, IOException
	{
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setBinaryStream(1, fin,fin.available());
		int i = ps.executeUpdate();
		System.out.println(1 + " rows effected");
		return this; 
	}
	
	public JDBCManager executeretriveQuery(String query) throws SQLException, IOException
	{
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		int i = 0;
		while (rs.next()) {
			InputStream in = rs.getBinaryStream(1);
			OutputStream f = new FileOutputStream(new File("C:\\pics\\profile\\retrive.jpg"));
			i++;
			int c = 0;
			while ((c = in.read()) > -1) {
				f.write(c);
			}
			f.close();
			in.close();
		}
		System.out.println("Success");
		return this;
	}
	
	public void close() throws SQLException
	{
		con.close();
	}

}
