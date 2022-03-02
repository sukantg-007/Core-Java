class InsufficientBalanceException extends RuntimeException
{
	InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}
class Account
{
	int accNo;
	String accHolderName;
	float balance;

	Account(int accNo, String accHolderName, float balance)
	{
		this.accNo=accNo;
		this.accHolderName=accHolderName;
		this.balance=balance;
	}
	public String toString()
	{
		String data="Acc No : "+accNo+"\n"+
					"Acc Name: "+accHolderName+"\n"+
					"Balance : "+balance+"\n";

		return data;
	}

	public void withdraw(int amt)
	{
		if(amt>balance){
			throw new InsufficientBalanceException("Withdrawal amount is more than balance");
		}else{
			balance=balance-amt;
			System.out.println("Successfully Withdrawal");
			System.out.println("New Balance : "+balance);
		}
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		Account acc=new Account(12345, "AAA", 10000);
		acc.withdraw(5000);
		System.out.println(acc);
	}
}
