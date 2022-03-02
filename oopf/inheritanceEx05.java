class A
{
	A()
	{
		System.out.println("A-con");
	}
	int m1()
	{
		System.out.println("m1-A");
		return 10;
	}
	int i=m1();
	{
		System.out.println("IB-A");
	}
}
class B extends A
{
	int m2()
	{
		System.out.println("m2-B");
		return 20;
	}
	{
		System.out.println("IB-B");
	}

	int j=m2();
	B()
	{
		System.out.println("B-con");
	}
}
class C extends B
{
	{
		System.out.println("IB-C");
	}

	int m3()
	{
		System.out.println("m3-C");
		return 30;
	}
	
	C()
	{
		System.out.println("C-con");
	}

	int k=m3();
	
}
class Test
{
	public static void main(String[] args)
	{
		C c=new C();
		System.out.println("------------------");
		C c2=new C();
	}
}