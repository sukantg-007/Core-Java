class A
{
	static
	{
		System.out.println("SB-A");
	}
}
class B extends A
{
	static
	{
		System.out.println("SB-B");
	}
}
class C extends B
{
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