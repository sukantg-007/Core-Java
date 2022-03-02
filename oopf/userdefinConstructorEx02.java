import java.util.*;
class Student
{
	private int sid;
	private String sname;

	public void setStudentDetials()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student detials");
		System.out.print("Student id : ");
		sid=sc.nextInt();
		System.out.print("Student name : ");
		sc.nextLine(); sname=sc.nextLine();

	}
	public void getStudentDetails()
	{
		System.out.println("Student Information");
		System.out.println("Student Id : "+sid);
		System.out.println("Student Name : "+sname);
	}
}
class Test
{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.setStudentDetials();
		s.getStudentDetails();
	}
}