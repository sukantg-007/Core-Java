package p1;

public class AccessModifier
{
	public void m1()
	{
		System.out.println("I am Public-m1");
	}
	private void m2()
	{
		System.out.println("I am private-m2");
	}
	void m3()
	{
		System.out.println("I am default-m3");
	}
	protected void m4()
	{
		System.out.println("I am protected");
	}
}

class A
{	
	public static void main(String[] args)
	{
		AccessModifier am= new AccessModifier();
		am.m1();
	//	am.m2();//AccessModifier.java:29: error: m2() has private access in AccessModifier
		am.m3();
		am.m4();
	}
}