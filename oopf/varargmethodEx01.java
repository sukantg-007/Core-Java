class A
{
	//variable arg method
	/*
	public void add(int...args)
	{
		System.out.println("Variable argument method");
	}
	*/
	public void add(int a)
	{
		System.out.println("mehtod 1 arg");
	}
	public void add(int a, int b)
	{
		System.out.println("mehtod 2 arg");
	}
	public void add(int a, int b, int c)
	{
		System.out.println("mehtod 3 arg");
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a=new A();
		a.add();
		a.add(10);
		a.add(10,20);
		a.add(10,20,30);
		a.add(10,20,30,40);
	}
}