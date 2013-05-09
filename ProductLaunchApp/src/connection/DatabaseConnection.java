package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.*;



//import java.sql.*;
//import com.mysql.jdbc.Driver;

class DatabaseConnection 
{
	Connection conn=null;
	static ResultSet rs,rs1,rs2,rs3,rs4;
	Statement stm=null;
	
	public DatabaseConnection()
	{
		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("11111");	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PLA","root","sa1234");
			System.out.println("constructor");
			stm=conn.createStatement();
			if(!conn.isClosed())
			{
			//	System.out.println("connection ok");
			}
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public String signUp(String email,String password, String Name, String company)
	{
		String result="";
		int rowcount;
		try{
			String querry="Insert into login (Email,password,Name,Company) values ('" +email+"','" +password+"','" +Name+"','"+company+"') ";
			
			rowcount=stm.executeUpdate(querry);
			if(rowcount>0)
			{
				result="true";
			//	System.out.println("inserted");
			}
			else
			{
				result="false";
			}
		}catch (SQLException e)
		{
			e.printStackTrace();
		}
		return result;
	}

public String login1(String user, String pwd)
{
	//System.out.println(userName);
	//System.out.println(pwd);
	String result;
	//int rowcount;
	try{
		String querry="SELECT * from login where Email='"+user+"' and Password='"+pwd+"'";
		//System.out.println(querry);
		ResultSet rs=stm.executeQuery(querry);
		
		if(rs.next())
		{
			
			result="true";
		//	System.out.println("logged in");
		}
		else
		{
			result="error";
		}
		
		return result;
	}catch (SQLException e)
	{
		e.printStackTrace();
		return"error";
	}
	
	
	
	
}
	
	
	





}
