class A
{
	public A getRefA()
	{
		A a=new A();
		return a;
	}

	public A getRef2A()
	{
		return this;
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a1=new A();
		System.out.println(a1);
		System.out.println(a1.getRefA());
		System.out.println(a1.getRefA());
		System.out.println(a1.getRefA());

		System.out.println("----------------");
		System.out.println(a1.getRef2A());
		System.out.println(a1.getRef2A());
		System.out.println(a1.getRef2A());
	}
}