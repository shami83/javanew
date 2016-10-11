package com.example.imageutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ImageUtil {
	
	
	public void insertFile() throws SQLException, ClassNotFoundException, IOException
	{
		FileInputStream fin=new FileInputStream("C:\\pics\\profile\\prof.jpg"); 
		JDBCManager.get().connection().executeInsertQuery("insert into image (image) values(?)", fin).close();
	}
	
	public void readFile() throws SQLException, ClassNotFoundException, IOException
	{
			JDBCManager.get().connection().executeretriveQuery("select image from image").close();
	}
	
	
	
	public static void main(String[] args) {
		
		
		ImageUtil inserter = new ImageUtil();
		try {
			//inserter.insertFile();
			inserter.readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
