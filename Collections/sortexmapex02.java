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

	public String toString()
	{
		String data="Student Id : "+sid+"\t"+
					"Student Name : "+sname+"\n";

		return data;
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, Student> tm=new TreeMap<>();
		tm.put(101,new Student(101,"AAA"));
		tm.put(105,new Student(105,"AAA"));
		tm.put(104,new Student(104,"AAA"));
		tm.put(103,new Student(103,"AAA"));
		tm.put(102,new Student(102,"AAA"));
		Set<Integer> s=tm.keySet();
		Iterator<Integer> itr=s.iterator();
		System.out.println("Studnet Id\t\tStudent Name");
		while(itr.hasNext())
		{
			Student std=tm.get(itr.next());
			System.out.println(std);

		}
	}
}
