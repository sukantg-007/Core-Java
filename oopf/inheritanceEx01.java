class Emp
{
	int eid;
	String ename;
	String eaddr;
	float esal;

/*
	Emp(int eid, String ename, String eaddr, float esal)
	{
	this.eid=eid;
	this.ename=ename;
	this.eaddr=eaddr;
	this.esal=esal;
	}
*/	

	public void getEmpDetails()
	{		
		System.out.println("Employee Id : "+eid);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Addr : "+eaddr);
		System.out.println("Employee Sal : "+esal);
	}
}

class Manager extends Emp
{
	Manager(int meid, String mename, String meaddr, float mesal)
	{	
		//super(meid, mename, meaddr, mesal);

		eid=meid;
		ename=mename;
		eaddr=meaddr;
		esal=mesal;
		
	}
	public void getManagerDetails()
	{
		System.out.println("Manager Details");
		getEmpDetails();
	}
}

class Engineer extends Emp
{
	Engineer(int meid, String mename, String meaddr, float mesal)
	{
		//super(meid, mename, meaddr, mesal);

		eid=meid;
		ename=mename;
		eaddr=meaddr;
		esal=mesal;

	}
	public void getEngineerDetails()
	{
		System.out.println("Engineer Details");
		getEmpDetails();
	}
}

class Test
{
	public static void main(String[] args)
	{
		Manager m=new Manager(100,"AAAManger","Daund",10000f);
		m.getManagerDetails();
		Engineer e=new Engineer(100,"BBBEngineer","Daund",9000f);
		e.getEngineerDetails();
	}
}