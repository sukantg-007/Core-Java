class A
{
	public void m1()
	{
		System.out.println("m1-A");
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a=new A(){
			public void m1()
			{
				System.out.println("m1-B");
			}
		};
		a.m1();
	}
}