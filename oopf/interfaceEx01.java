interface Arithmetic
{
	void m1();
	float PI=3.14f;
}
/*
interface Arithmetic {
  public static final float PI;
  public abstract void m1();
}
*/
class A implements Arithmetic
{
	public void m1()
	{
		System.out.println("m1:I am in A");
	}
}
class B implements Arithmetic
{
	public void m1()
	{
		System.out.println("m1:I am in B");
	}
}
class Test
{
	public static void main(String[] args)
	{
		//Arithmetic a= new Arithmetic();//Arithmetic is abstract; cannot be instantiated
		A a= new A();
		a.m1();
		B b=new B();
		b.m1();
	}
}