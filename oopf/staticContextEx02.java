class A
{
	int i=10;
	public void m1()
	{
		System.out.println("m1-A");
	}

	static public void m2()
	{
		System.out.println("static m2-A");
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a=new A();
		a.m1();
		a.m2();

		A.m2();

		A a2=null;
		//a2.m1();
		a2.m2();
	}
}