import java.util.Scanner;

class Student
{
	private int sid;
	private String sname;
	private String saddr;
	private String smobile;

	//mutator methods
	public void setSid(int id)
	{
		sid=id;
	}
	public void setSname(String name)
	{
		sname=name;
	}
	public void setSaddr(String addr)
	{
		saddr=addr;
	}
	public void setSmobile(String mobile)
	{
		smobile=mobile;
	}

	//accessor methods
	public int getSid()
	{
		return sid;
	}
	public String getSname()
	{
		return sname;
	}
	public String getSaddr()
	{
		return saddr;
	}
	public String getSmobile()
	{
		return smobile;
	}

}

class Test
{
	public static void main(String[] args)
	{
		/*
		Student s=new Student();
		s.setSid(100);
		s.setSname("AAA");
		s.setSaddr("Daund");
		s.setSmobile("9860047497");

		System.out.println("Student Information");
		System.out.println("Student Id : "+s.getSid());
		System.out.println("Student Name : "+s.getSname());
		System.out.println("Student Addr : "+s.getSaddr());
		System.out.println("Student Mobile : "+s.getSmobile());
		*/
		Student[] s=new Student[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			System.out.print("Enter Student id : ");
			int id=sc.nextInt();
			System.out.println("Enter Student name : ");
			sc.nextLine();String name=sc.nextLine();
			System.out.println("Enter Student Addr : ");
			String addr=sc.nextLine();
			System.out.println("Enter Student Mobile : ");
			String mobile=sc.nextLine();
			s[i]=new Student();
			s[i].setSid(id);
			s[i].setSname(name);
			s[i].setSaddr(addr);
			s[i].setSmobile(mobile);
		}
		System.out.println("Studet Details are as follows...");

		for (int i=0;i<2;i++)
		{
			System.out.println("Student Information");
			System.out.println("Student Id : "+s[i].getSid());
			System.out.println("Student Name : "+s[i].getSname());
			System.out.println("Student Addr : "+s[i].getSaddr());
			System.out.println("Student Mobile : "+s[i].getSmobile());
		}
	}
}