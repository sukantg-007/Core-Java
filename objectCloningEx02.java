class Account
{
	String accNo;
	String accHolderName;
	String accType;
	int bal;

	Account(String accNo,String accHolderName,String accType,int bal)
	{
		this.accNo=accNo;
		this.accHolderName=accHolderName;
		this.accType=accType;
		this.bal=bal;		
	}

	public String toString()
	{
		String data="\nAccount Information\n"+
					"Account Number : "+accNo+"\n"+
					"Account Holder Name : "+accHolderName+"\n"+
					"Account Type : "+accType+"\n"+
					"Account Balance : "+bal;

		return data;
	}
}

class Employee implements Cloneable
{
	int eid;
	String ename;
	float esal;
	String eaddr;
	Account acc;

	Employee(int eid,String ename,float esal,String eaddr, Account acc)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		this.eaddr=eaddr;		
		this.acc=acc;		
	}

	public String toString()
	{
		String data="Employee Information\n"+
					"Employee Number : "+eid+"\n"+
					"Employee Name : "+ename+"\n"+
					"Employee Sal : "+esal+"\n"+
					"Employee Addr : "+eaddr+"\n"+acc.toString();					

		return data;
	}
	public Employee empClone()throws CloneNotSupportedException
	{
		Account accNew=new Account(acc.accNo, acc.accHolderName, acc.accType, acc.bal);
		Employee empNew=new Employee(this.eid, this.ename, this.esal, this.eaddr, accNew);
		return empNew;
	}
}

class Test
{
	public static void main(String[] args)throws CloneNotSupportedException
	{
		Account acc=new Account("123456","AAA","Saving",250000);
		Employee e=new Employee(111,"AAA",12000f,"Daund",acc);
		System.out.println(e);
		System.out.println("Original Container Object :"+e.hashCode());
		System.out.println("Original Contained Object :"+e.acc.hashCode());
		System.out.println("----------------------------------");
		Employee eNew=e.empClone();
		System.out.println(eNew);
		System.out.println("Duplicate Container Object : "+eNew.hashCode());
		System.out.println("Duplicate Contained Object : "+eNew.acc.hashCode());
	}
}