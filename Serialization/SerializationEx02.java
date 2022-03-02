import java.io.*;
class Student implements Serializable
{
	int sid;
	String sname;
	String saddr;

	Student(int sid, String sname, String saddr)
	{
		this.sid=sid;
		this.sname=sname;
		this.saddr=saddr;
	}

	public String toString()
	{
		String data="Student Id : "+sid+"\n"+
					"Student Name : "+sname+"\n"+
					"Student addr: "+saddr;
		return data;
	}
}
class Test
{
	public static void main(String[] args)throws Exception
	{
		Student s=new Student(100,"AAA","Daund");

		FileOutputStream fos=new FileOutputStream("xyz.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);

		FileInputStream fis=new FileInputStream("xyz.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s1=(Student)ois.readObject();

		System.out.println(s1);

	}
}