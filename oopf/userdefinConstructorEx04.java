import java.util.*;
class Student
{
	private int sid;
	private String sname;

	Student(int id, String name)
	{
		sid=id;
		sname=name;
	}
	public String toString()
	{
		String data="Student Information\n"+
					"Student Id : "+sid+"\n"+
					"Student Name : "+sname;
		return data;
	}
}
class Test
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student detials");
		System.out.print("Student id : ");
		int id=sc.nextInt();
		System.out.print("Student name : ");
		sc.nextLine();String name=sc.nextLine();

		Student s=new Student(id,name);
		System.out.println(s);
	}
}

