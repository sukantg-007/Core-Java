class A
{
	{//1
		System.out.println("I am Instance Block 1");
	}
	int a=m1();//2
	
	{//4
		System.out.println("a : "+a);
		System.out.println("I am Instance Block 2");
	}
	public int m1()//3
	{
		System.out.println("IM-M1");
		return 10;
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a=new A();
	}
}