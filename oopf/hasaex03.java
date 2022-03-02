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
		String data=cid+"\t"+cname+"\n";

		return data;
	}
}

class Student
{
	int sid;
	String sname;
	String saddr;
	Course[] course;

	Student(int sid,String sname,String saddr,Course[] course)
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
	public void setCourse(Course[] course)
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
	public Course[] getCourse()
	{
		return course;
	}
}

class Test
{
	public static void main(String[] args)
	{
		Course c1=new Course("1001","C prog");
		Course c2=new Course("1002","C++ prog");
		Course c3=new Course("1003","Data Structure");
		Course c4=new Course("1004","Core Java");

		Course[] courses1={c1,c2,c3,c4};
		Course[] courses2={c2,c3,c4};
		Course[] courses3={c2,c4};
		//Course[] courses4={c1,c3};

		Student s1=new Student(100,"AAA","Daund",courses1);
		Student s2=new Student(101,"BBB","Daund",courses2);
		Student s3=new Student(102,"CCC","Daund",courses3);
		Student s4=new Student(103,"DDD","Daund",new Course[]{c1,c2});

		Student[] s={s1,s2,s3,s4};

		System.out.println("Student Details");
		for(Student st:s)
		{
			System.out.println("Student Id: "+st.getSid());
			System.out.println("Student Name: "+st.getSname());
			System.out.println("Student Addr: "+st.getSaddr());
			System.out.println("CID\tCNAME");
			for(Course c: st.getCourse()){
				System.out.println(c);
			}
			System.out.println("--------------------------------------");
		}
	}
}