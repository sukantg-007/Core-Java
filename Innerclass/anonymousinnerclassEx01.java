class A
{
	public void m1()
	{
		System.out.println("m1-A");
	}
}
class B extends A
{
	public void m1()
	{
		System.out.println("m1-B");
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a=new B();
		a.m1();
	}
}