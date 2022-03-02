import java.util.*;
import java.util.function.*;
class Student
{
	private int sid;
	private String sname;
	private String saddr;
	private double marks;
	Student(int sid, String sname, String saddr, double marks)
	{
		this.sid=sid;
		this.sname=sname;
		this.saddr=saddr;
		this.marks=marks;
	}

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
	public double getMarks()
	{
		return marks;
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student(111, "AAA", "Daund",85.5));
		list.add(new Student(116, "AAA", "Daund",55.5));
		list.add(new Student(115, "AAA", "Daund",66.6));
		list.add(new Student(117, "AAA", "Daund",35.5));
		list.add(new Student(112, "AAA", "Daund", 78.8));
		list.add(new Student(114, "AAA", "Daund", 69.2));
		list.add(new Student(113, "AAA", "Daund", 33.3));

		Predicate<Student> p=s->s.getMarks()>=35;
		Function<Student, String> f=s->	s.getMarks()>=80?"Distinction":
										s.getMarks()>=70?"First-Class":
										s.getMarks()>=60?"Second-Class":
										s.getMarks()>=35?"Pass-Class":"Fail";
		Consumer<Student> c=s->System.out.println("|"+s.getSid()+"|\t|"+s.getSname()+"|\t|"+s.getMarks()+"|\t"+String.format("|%15s|",f.apply(s))+"\t"+s.getSaddr()+"|\t"+p.test(s)+"|");
		
		System.out.println("SID\tSNAME\tMARKS\t\tGRADE\t\tADDRESS\tIS-PASS");
		for (Student s: list )
		{
			c.accept(s);
		}

	}
}
