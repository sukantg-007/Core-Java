import java.io.*;
class Test
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Name : ");
		String name=br.readLine();
		System.out.println("Enter Your Addr : ");
		String addr=br.readLine();
		System.out.println("Enter Your Salry : ");
		String sal=br.readLine();
		float esal=Float.parseFloat(sal);
		System.out.println("Enter Your Id : ");
		String id=br.readLine();
		int eid=Integer.parseInt(id);

		System.out.println("Employee Information");
		System.out.println("Employee Id	: "+eid);
		System.out.println("Employee Name	: "+name);
		System.out.println("Employee Sal	: "+esal);
		System.out.println("Employee Addr	: "+addr);
	}
}
/*output
C:\Users\Vedanta-PC02\Desktop\student\java900>javac bufferedEx04.java

C:\Users\Vedanta-PC02\Desktop\student\java900>java Test
Enter Your Name :
AAA
Enter Your Addr :
Daund
Enter Your Salry :
5000
Enter Your Id :
100
Employee Information
Employee Id     : 100
Employee Name   : AAA
Employee Sal    : 5000.0
Employee Addr   : Daund
*/