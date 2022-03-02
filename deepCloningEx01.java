class Course
{
	int cid;
	String cname;
	Course(int cid, String cname)
	{
		this.cid=cid;
		this.cname=cname;
	}

	public String toString()
	{
		String data="Course Id : "+cid+"\n"+
					"Course Name : "+cname;

		return data;
	}
}

class Student
{
	int sid;
	String sname;
	String saddr;
	Course course;

	Student(int sid, String sname,String saddr, Course course )
	{
		this.sid=sid;
		this.sname=sname;
		this.saddr=saddr;
		this.course=course;
	}

	public String toString()
	{
		String data="Student Details\n"+
					"Student Id : "+sid+"\n"+
					"Student Name : "+sname+"\n"+		
					"Student Addr : "+saddr+"\n"+course.toString();	

		return data;
	}
	public Object clone()throws CloneNotSupportedException
	{
		Course c=new Course(course.cid, course.cname);
		Student s=new Student(this.sid, this.sname, this.saddr,c);
		return s;
	}
}
class Test
{
	public static void main(String[] args)throws CloneNotSupportedException
	{
		Course c=new Course(123,"CORE-JAVA");
		Student s=new Student(100,"AAA","Daund",c);
		System.out.println(s);
		System.out.println("Original Container : "+s.hashCode());
		System.out.println("Original Contained : "+s.course.hashCode());
		System.out.println("---------------------------------");
		Student s1=(Student)s.clone();
		System.out.println(s1);
		System.out.println("Cloned Container : "+s1.hashCode());
		System.out.println("Cloned Contained : "+s1.course.hashCode());
	}
}