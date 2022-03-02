import java.util.Scanner;

class Student
{
	private int sid;
	private String sname;

	public void setSid(int id)
	{
		sid=id;
	}
	public int getSid()
	{
		return sid;
	}
	public void setSname(String name)
	{
		sname=name;
	}
	public String getSname()
	{
		return sname;
	}

	public String toString()
	{
		String data="Student Details\n"+
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
		System.out.print("How many student : ");
		int len=sc.nextInt();
		Student s[]= new Student[len];
		for (int i=0;i<s.length;i++)
		{		
			System.out.print("Enter Student Id : ");
			int id=sc.nextInt();
			System.out.print("Enter Student Name : ");
			sc.nextLine();String name=sc.nextLine();
			s[i]=new Student();
			s[i].setSid(id);
			s[i].setSname(name);
		}
		
		for (int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}


	}
}