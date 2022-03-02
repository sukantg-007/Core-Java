class Student
{
	private int sid;
	private String sname;

	public void setSid(int sid)
	{
		this.sid=sid;
	}
	public void setSname(String sname)
	{
		this.sname=sname;
	}

	public int getSid()
	{
		return sid;
	}
	public String getSname()
	{
		return sname;
	}
}

class Test
{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.setSid(100);
		s.setSname("AAA");
		System.out.println("Student Information");
		System.out.println("Student Id : "+s.getSid());
		System.out.println("Student Name : "+s.getSname());
	}
}