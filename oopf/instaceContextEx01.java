class A
{
	int a=10;
	{
		System.out.println("Instance Block");
		System.out.println(a);
	}
	public void m1()
	{
		System.out.println("Instance Method -m1");
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