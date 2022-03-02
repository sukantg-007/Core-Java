import java.util.Scanner;
class Employee
{
	private int eid;
	private String ename;
	private float esal;
	private String eaddr;

	public void setEid(int id)
	{
		eid=id;
	}
	public void setEname(String name)
	{
		ename=name;
	}
	public void setEsal(float sal)
	{
		esal=sal;
	}
	public void setEaddr(String addr)
	{
		eaddr=addr;
	}

	public int getEid()
	{
		return eid;
	}
	public String getEname()
	{
		return ename;
	}
	public float getEsal()
	{
		return esal;
	}
	public String getEaddr()
	{
		return eaddr;
	}
	
	public String toString()
	{
		String data="Employee Information \n"+
					"Employee Id : "+eid+"\n"+
					"Employee Name : "+ename+"\n"+
					"Employee Sal : "+esal+"\n"+
					"Employee Addr : "+eaddr;

		return data;
	}
}

class Test
{
	public static void main(String[] args)
	{
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Information");
		System.out.print("Employee id : ");
		int id=sc.nextInt();
		System.out.print("Employee Name : ");
		sc.nextLine();String name=sc.nextLine();
		System.out.print("Employee Sal : ");
		float sal=sc.nextFloat();
		System.out.print("Employee Addr : ");
		sc.nextLine();String addr=sc.nextLine();

		e.setEid(id);
		e.setEname(name);
		e.setEsal(sal);
		e.setEaddr(addr);

		System.out.println(e);
	}
}