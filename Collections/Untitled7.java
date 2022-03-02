import java.util.*;
import java.io.*;
class Test 
{
	public static void main(String[] args)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println("Enter user name : ");
		String uname=sc.nextLine();
		System.out.println("Enter password : ");
		String pass=sc.nextLine();
		if(uname.equalsIgnoreCase(p.getProperty("uname"))&&pass.equals(p.getProperty("pass")))
		{
			System.out.println("success");
		}else{
			System.out.println("fail");
		}
	}
}
