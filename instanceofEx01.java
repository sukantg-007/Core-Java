class A
{
}
class B extends A
{
}
class Test
{
	public static void main(String[] args)
	{
		A a=new A();
		B b=new B();
		//B b=null;
		System.out.println("a instance of B : "+(a instanceof B));
		System.out.println("b instance of B : "+(b instanceof B));
		System.out.println("b instance of A : "+(b instanceof A));
	}
}