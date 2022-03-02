class A
{
	int i;
	int j;
	static int z;

	public void m1()
	{
		System.out.println(A.z);
	}
	A(int x, int y)
	{
		i=x;
		j=y;
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a1=new A(10,20);
		A a2=new A(30,40);
		A.z=200;
		System.out.println(a1.i+"..."+a1.j+"..."+a1.z);
		System.out.println(a2.i+"..."+a2.j+"..."+a2.z);
		a1.z=400;
		a1.i=100;
		a1.j=200;
		System.out.println(a1.i+"..."+a1.j+"..."+a1.z);
		System.out.println(a2.i+"..."+a2.j+"..."+a2.z);

		a2.m1();
	}
}