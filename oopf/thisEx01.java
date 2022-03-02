class A
{
	int i=100;
	int j=200;
	
	A(int i, int j)
	{
		System.out.println(i+"..."+j);
		System.out.println(this.i+"..."+this.j);
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a=new A(10,20);//this rep current object
	}
}