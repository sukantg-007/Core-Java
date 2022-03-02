import java.util.*;

class Employee
{
	int eid;
	String ename;
	float esal;
	String eaddr;

	public void getEmpDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee Details");
		System.out.print("Enter Emp Id : ");
		eid=sc.nextInt();
		System.out.print("Enter Emp Name : ");
		sc.nextLine();ename=sc.nextLine();
		System.out.print("Enter Emp Sal : ");
		esal=sc.nextFloat();
		System.out.print("Enter Emp Addr : ");
		sc.nextLine();eaddr=sc.nextLine();
	}

	public void showEmpDetails()
	{
		System.out.println("Employee Information");
		System.out.println("Employee Id : "+eid);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Salary : "+esal);
		System.out.println("Employee Addr : "+eaddr);
	}
}

class Test
{
	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.getEmpDetails();
		e.showEmpDetails();
	}
}