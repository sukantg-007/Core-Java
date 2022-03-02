class Course
{
	private String cid;
	private String cname;

	Course(String cid, String cname)
	{
		this.cid=cid;
		this.cname=cname;
	}

	public void setCid(String cid)
	{
		this.cid=cid;
	}

	public void setCname(String cname){
		this.cname=cname;
	}
	public String getCid(){
		return cid;
	}
	public String getCname(){
		return cname;
	}

	public String toString()
	{
		String data="Course Id : "+cid+"\n"+
					"Course Name: "+cname;

		return data;
	}
}

class Student
{
	int sid;
	String sname;
	String saddr;
	Course course;

	Student(int sid,String sname,String saddr,Course course)
	{
		this.sid=sid;
		this.sname=sname;
		this.saddr=saddr;
		this.course=course;
	}

	public void setSid(int sid){
		this.sid=sid;
	}
	public void setSname(String sname)
	{
		this.sname=sname;
	}

	public void setSaddr(String saddr)
	{
		this.saddr=saddr;
	}
	public void setCourse(Course course)
	{
		this.course=course;
	}

	public int getSid(){
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
	public Course getCourse()
	{
		return course;
	}
}

class Test
{
	public static void main(String[] args)
	{
		Course c=new Course("1001","Core Java");

		Student s1=new Student(100,"AAA","Daund",c);
		Student s2=new Student(101,"BBB","Daund",c);
		Student s3=new Student(102,"CCC","Daund",c);
		Student s4=new Student(103,"DDD","Daund",c);

		Student[] s={s1,s2,s3,s4};

		System.out.println("Student Details");
		for(Student st:s)
		{
			System.out.println("Student Id: "+st.getSid());
			System.out.println("Student Name: "+st.getSname());
			System.out.println("Student Addr: "+st.getSaddr());
			System.out.println(st.getCourse());
			System.out.println("------------------------------");
		}
	}
}