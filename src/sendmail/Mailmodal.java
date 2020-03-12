package sendmail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import oracle.jdbc.OracleDriver;

public class Mailmodal
{
	ResultSet res;
	Connection con;
	PreparedStatement pstmt;
	
	private String mail;
	private String otp;
	private String password;

	
	public String getmail()
	{
		return mail;
	}
	public void setmail(String mail)
	{
		this.mail= mail;
	}
	public String getotp()
	{
		return otp;
	}
	public void setotp(String otp)
	{
		this.otp= otp;
	}
	public String getpassword()
	{
		return password;
	}
	public void setpassword(String password)
	{
		this.password=password;
	}
	
	
	//connection is made
	public Mailmodal()
	{
		try
		{
			DriverManager.deregisterDriver(new OracleDriver());
			con=DriverManager.getConnection("jdbc:oracle:thin://@localhost:1521/XE", "system", "chai");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}




//registration form query
public int register()
{
	try
	{
		String s="INSERT INTO EMPLOYEE VALUES(?,?)";
		pstmt=con.prepareStatement(s);
		
		pstmt.setString(1, mail);
		pstmt.setString(2, password);
		int x=pstmt.executeUpdate();
		return x;
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	return 0;
}



}
