package databasexamples;

import java.sql.*;
import java.util.Scanner;

public class PrepareExample {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your username");
		String name=sc.next();
		System.out.println("Enter your password");
		String pwd=sc.next();
		
	    Class.forName("org.postgresql.Driver");
	    
	    Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost/hello","nikhil","nikhil");
	    
	    PreparedStatement stmt=conn.prepareStatement("select * from users where username=? and password=?");
        
        stmt.setString(1, name);
        stmt.setString(2, pwd);
        
        ResultSet result=stmt.executeQuery();
        
        if(result.next()) {
      	  System.out.println("login succuss");
        }else
        {
      	  System.out.println("login denied....enter correct details");
        }
        
        conn.close();
	    

       
         }
		
		
	}


