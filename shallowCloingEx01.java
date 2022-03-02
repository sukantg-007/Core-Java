class Account
{
	String accNo;
	int bal;

	Account(String accNo, int bal)
	{
		this.accNo=accNo;
		this.bal=bal;
	}
	public String toString()
	{
		String data="\nAccount Information\n"+
					"Account Number : "+accNo+"\n"+
					"Account Balance: "+bal					
		return data;
	}
}
class Employee
{
	int eid;
	String ename;
	Account acc;

	Employee(int eid, String ename, Account acc)
	{
		this.eid=eid;
		this.ename=ename;
		this.acc=acc;
	}
	public String toString()
	{
		String data="Employee Information\n"+
					"Employee Number : "+eid+"\n"+
					"Employee Name: "+ename+"\n"+acc.toString();			
		return data;
	}
}