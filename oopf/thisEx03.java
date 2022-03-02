class A
{
	public void m1()
	{
		System.out.println("m1-A");
		m2();
		this.m2();
	}
	public void m2()
	{
		System.out.println("m2-A");
	}
	{
		System.out.println("Inside block");
		this.m1();
		this.m2();
		System.out.println("End of block");
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a=new A();
		a.m1();
	}
}