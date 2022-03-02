class A
{
	static
	{
		System.out.println("SB-A");
	}
	static int i=m1();

	public static int m1()
	{
		System.out.println("m1-A");
		return 10;
	}
}
class B extends A
{
	static int j=m2();

	public static int m2()
	{
		System.out.println("m2-B");
		return 10;
	}
	static
	{
		System.out.println("SB-B");
	}
}
class C extends B
{
	public static int m3()
	{
		System.out.println("m3-C");
		return 10;
	}
	static int k=m3();

	static
	{
		System.out.println("SB-C");
	}
}

class Test
{
	public static void main(String[] args)
	{
		C c=new C();
	}
}