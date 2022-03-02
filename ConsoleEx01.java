//console example
import java.io.*;

class ConsoleDemo 
{
	public static void main(String[] args)throws IOException 
	{
		Console c= System.console();

		String uname=c.readLine("Enter username : ");
		char[] pass=c.readPassword("Enter password : ");
		String upass=new String(pass);
		if (uname.equals("Java")&&upass.equals("1234"))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login Failed");
		}
	}
}
