class A
{
	static
	{
		System.out.println("A-Class-bytecode loading");
	}

	{
		System.out.println("A-Class instance block");
	}
	A()
	{
		System.out.println("A-Object creating");
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a=new A();
	}
}