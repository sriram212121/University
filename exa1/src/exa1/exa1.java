package exa1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;



public class exa1 {

	
	public static void main(String[] args)
	{
		
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String Uname="system";
		String Pwd="sriram";
		String sql="select * from student where regno=?";
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully");
			con=DriverManager.getConnection(url,Uname,Pwd);
			 
			System.out.println("connection established");
			pstmt=con.prepareStatement(sql);
			System.out.println("Prepared statement medium created");
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the reg no");
			int reg=scan.nextInt();
			pstmt.setInt(1, reg);
			rs=pstmt.executeQuery();
			System.out.println("sql query is executed and result is with the program");
			
			if(rs.next()==true) {
				
			String a=rs.getString("name");
			
			int regno=rs.getInt("regno");
			String b=rs.getString("username");
			int c=rs.getInt("m1");
			int d=rs.getInt("m2");
			int e=rs.getInt("m3");
			int f=rs.getInt("avg");
			System.out.println(a+" "+regno+" "+b+" "+c+" "+d+" "+e+" "+f+" ");
			
				
			}
			else {
				
				System.out.println("invalid reg no");
			}
			
			
			
		}
		
		catch(Exception e) {
			
			System.out.println("fail");
			
		}
		
		
	}
}
