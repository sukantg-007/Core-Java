class A
{
	int a=m1();
	{
		System.out.println("Instance Block");
		System.out.println(a);
	}
	public int m1()
	{
		System.out.println("Instance Method -m1");
		return 10;
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a=new A();		
	}
}