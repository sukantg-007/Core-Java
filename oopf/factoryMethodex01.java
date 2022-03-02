class A
{
	private A()
	{
		System.out.println("private constructor");
	}

	public void m1()
	{
		System.out.println("Method-m1");
	}

	public static A getRef()
	{
		A a=new A();
		return a;
	}

	public A getRefA()
	{
		A a=new A();
		return a;
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a1 =A.getRef();
		a1.m1();
		A a2=a1.getRefA();
		System.out.println("Objec 1: "+a2);
		A a3=a1.getRefA();
		System.out.println("Object 2: "+a3);
	}
}