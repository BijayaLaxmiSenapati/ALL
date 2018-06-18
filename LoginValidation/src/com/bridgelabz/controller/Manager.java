package com.bridgelabz.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.bridgelabz.utility.Utility;

import java.sql.SQLException;

public class Manager 
{
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stmt=null;
		String q1="insert into Emp_Information.Employee values('bijaya',23,7377145005,'bijaya.8434@gmail.com',mama1234)";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class is loaded and registered");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "root");
			System.out.println("Connection is established");
			stmt=con.createStatement();
			System.out.println("Platform is created");
			stmt.executeUpdate(q1);
			System.out.println("Data inserted successfully");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(stmt!=null)
			{
				try
				{
				stmt.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try
				{
				con.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
		}

		/*UserServiceImplementation userServi
		System.out.println("What do you want to do?");
		System.out.println("Enter 1.Register/t 2.Login");
		int option=Utility.retInt();
		switch (option)
		{
		case 1:
			
			break;

		case 2:
			break;
		}*/
	}

}
