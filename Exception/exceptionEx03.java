class Test
{
	/*
	public static void main(String[] args)
	{
		System.out.println(10/0);
	}
	*/
	
	public static void main(String[] args)
	{
		throw new ArithmeticException("/ by zero");
	}
}