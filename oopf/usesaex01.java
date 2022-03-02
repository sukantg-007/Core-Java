import java.util.*;
class Account
{
	int accno;
	String accHolderName;
	String bank;
	float balance;
	
	public int getAccno()
	{
			return accno;
	}

	public float getBalance()
	{
			return balance;
	}

	public String getAccHolderName()
	{
			return accHolderName;
	}

	public String getBank()
	{
			return bank;
	}

	public void setBalance(float balance)
	{
		this.balance=balance;
	}

	Account(int accno, String accHolderName, String bank, float balance)
	{
		this.accno =accno;
		this.accHolderName=accHolderName;
		this.bank=bank;
		this.balance=balance;
	}
}
class Transaction
{
	int tid;
	Date date;
	String tType;
	
	Transaction(int tid, Date date, String tType)
	{
		this.tid=tid;
		this.date=date;
		this.tType=tType;
	}
	public void getDeposit(Account acc, float depAmt)
	{
		float bal=acc.getBalance();
		bal=bal+depAmt;
		acc.setBalance(bal);
		date=new Date();
		System.out.println("Transaction Details");
		System.out.println("Transaction Id : "+tid);
		System.out.println("Transaction Type : "+tType);
		System.out.println("Transaction Date : "+date);
		System.out.println("Deposit Amout : "+depAmt);
		System.out.println("Account Details ");
		System.out.println("Account Bank : "+acc.getBank());
		System.out.println("Account No : "+acc.getAccno());
		System.out.println("Account Holder Name : "+acc.getAccHolderName());		
		System.out.println("Account Balace : "+acc.getBalance());

	}
}
class Test
{
	public static void main(String[] args)
	{
		Account acc=new Account(123456,"AAA","ICICI",25000f);
		Transaction trn=new Transaction(1111,new Date(),"Deposit");
		trn.getDeposit(acc, 25000f);
	}
}