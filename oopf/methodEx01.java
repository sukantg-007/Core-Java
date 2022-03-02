class Arithmetic
{
	public int add(int x, int y)
	{
		int z;
		z=x+y;
		return z;
	}

	public int mult(int x, int y)
	{
		int z;
		z=x*y;
		return z;
	}

	public int square(int x)
	{
		int z;
		z=(int)Math.pow(x,2);
		return z;
	}
}

class Test
{
	public static void main(String[] args)
	{
		Arithmetic a = new Arithmetic();
		int ad=a.add(10,20);
		int mul=a.mult(100,200);
		int sqr=a.square(5);
		System.out.println("Addition : "+ad);
		System.out.println("Multiplication : "+mul);
		System.out.println("Square of 5  : "+sqr);
		System.out.println("Random number : "+Math.random());
	}
}