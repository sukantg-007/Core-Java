class A
{
	int a=10;
	A()
	{
		System.out.println("Const-A");
	}
	public void m1()
	{
		System.out.println("m1-A");
	}
}
class B extends A
{
	int a=20;
	B()
	{
		//super();//it represents super class constructor
		System.out.println("Const-B");
		
	}
	B(int a)
	{
		super();		
		System.out.println("parameter-Const-B");
	}

	public void m2()
	{
		int a=30;
		System.out.println("m1-B");
		//super.m1();
		//m1();
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
class Test
{
	public static void main(String[] args)
	{
		B b=new B(10);
//		b.m2();
	}
}