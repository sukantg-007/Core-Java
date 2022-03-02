class A
{
	A()
	{
		this(10);
		System.out.println("0-arg const");
	}

	A(int i)
	{
		this(22.2f);
		System.out.println("int-arg const");
		//this(22.2f); call to this must be first statement in constructor
	}

	A(float f)
	{
		//this();
		System.out.println("float-arg const");
	}
	public void m1()
	{
		//this();
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a=new A();
	}
}