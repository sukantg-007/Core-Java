import java.util.*;
class Student
{
	int sid;
	String sname;

	Student(int sid, String sname)
	{
		this.sid=sid;
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
		HashSet<Student> hs=new HashSet<>();
		hs.add(new Student(100,"AAA"));
		hs.add(new Student(101,"BBB"));
		hs.add(new Student(102,"CCC"));
		hs.add(new Student(103,"DDD"));
		hs.add(new Student(104,"EEE"));
		Iterator<Student> itr=hs.iterator();
		System.out.println("STUDENT ID\tSTUDENT NAME");
		while(itr.hasNext())
		{
			Student s=itr.next();
			System.out.println(s.getSid()+"\t\t"+s.getSname());
		}

	}
}
