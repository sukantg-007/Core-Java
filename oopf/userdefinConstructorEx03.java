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
		Student s=new Student(100,"Tushar");
		System.out.println(s);
	}
}