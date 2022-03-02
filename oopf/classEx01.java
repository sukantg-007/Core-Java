import java.util.*;

class Student
{
	int sid;
	String sname;
	String saddr;
	String smobile;

	public void getStudentDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student Id : ");
		sid=sc.nextInt();
		System.out.print("Enter Student Name : ");
		sc.nextLine();sname=sc.nextLine();
		System.out.print("Enter Student Addr : ");
		saddr=sc.nextLine();
		System.out.print("Enter Student Mobile : ");
		smobile=sc.nextLine();
	}

	public void showDetails()
	{
		System.out.println("Student Information");
		System.out.println("Student ID : "+sid);
		System.out.println("Student Name : "+sname);
		System.out.println("Student Addr : "+saddr);
		System.out.println("Student Mobile : "+smobile);
	}
}
//main class
class Test
{
	public static void main(String[] args)
	{
		Student std=new Student();
		std.getStudentDetails();
		std.showDetails();
	}
}