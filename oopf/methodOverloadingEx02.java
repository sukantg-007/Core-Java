class A
{
	public void add(float x, float y)
	{
		System.out.println("Float-add");
	}

	public void add(int x, int y)
	{
		System.out.println("int-add");
	}

}
class Test
{
	public static void main(String[] args)
	{
		A a=new A();
		a.add(10l,20l);
		Short s=10, s2=20;
		a.add(s,s2);
		a.add('a','b');
	}
}