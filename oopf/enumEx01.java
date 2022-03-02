enum User_Status
{
	AVAILABLE, BUSY, IDLE;
}

class Test
{
	public static void main(String[] args)
	{
		System.out.println(User_Status.AVAILABLE);
		System.out.println(User_Status.BUSY);
		System.out.println(User_Status.IDLE);
	}
}