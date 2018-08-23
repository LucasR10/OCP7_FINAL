package br.com.ocjp7.exceptions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionsTeste {

	public static void main(String[] args) {
		
		

	}

}


class MultiCatch{
	
	//try {}
	//catch(SQLException | IOException e) // esse duas sentecas não compilam
	//catch(IOException | SQLException e)
	
	public void teste () {
		
		List l = new ArrayList<>();
		System.out.println(" class " + l.getClass() );
		try {
			//access the database and write to a file
		 DriverManager.getConnection("", "", "");
		 PrintWriter p = new PrintWriter(new File(""));
		// File file = new File("lines.txt");
		  // FileNotFoundException | IOException  - > The exception FileNotFoundException is already caught by the alternative IOException
		}catch( SQLException  |  IOException   e) { 
			
		}
		
		
		///compila
		    try {
		    	 FileNotFoundException();
			} catch (IOException e) {
			 e = new IOException();
			}
		
	}
	
	public void rethrow() throws SQLException, IOException {
		 try {
		 couldThrowAnException();
		 } catch (SQLException | IOException e) {
		 //log(e);
		 throw e;
		 }
		}
	
	public void couldThrowAnException() throws IOException, SQLException {}
	
	public void FileNotFoundException() throws java.io.FileNotFoundException {
		PrintWriter p = new PrintWriter(new File(""));
	}
	
	
	public void rethrows () throws IOException, SQLException{
		
		try {
			
		}catch( Exception e) {
			e = new IOException();
			//throw e;
		}
		
		
	}
	

	
}