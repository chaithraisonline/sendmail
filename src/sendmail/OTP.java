package sendmail;

public class OTP 
{
	
	public int OTP()
	{

		double d=Math.random();//this function generates the values between 0 and 1
		System.out.println(d);
		d=d*1000000;   //opt usually 6 numbers soappend 6 zeroes to 1 
		System.out.println(d);//which gives double value
		int OTP=(int) d;      //casting is done to get integer number
		System.out.println(OTP);
		return OTP;
		
	}
	public static void main(String arg[])
	{
		
	}
	
}
