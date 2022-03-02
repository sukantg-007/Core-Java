class FindSqrt
{
	public void sqrt(int...args)
	{
		
		//public static double sqrt(double);
		for(int arg: args)
		{
			System.out.println("Square Root of "+arg+" : "+(float)Math.sqrt(arg));
		}
	}
}
class Test
{
	public static void main(String[] args)
	{
		FindSqrt fs=new FindSqrt();
		fs.sqrt(10);
		fs.sqrt(11,22);
		fs.sqrt(9,16,25);
	}
}