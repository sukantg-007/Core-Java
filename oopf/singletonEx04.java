class A
{
	static A a=null;
	private A()
	{
	}

	static A getRef()
	{
		return a;
	}
	static
	{
		a=new A();
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a1=A.getRef();
		System.out.println("First obj "+a1);
		A a2=A.getRef();
		System.out.println("Sec obj "+a2);
		A a3=A.getRef();
		System.out.println("Third obj "+a3);

	}
}
