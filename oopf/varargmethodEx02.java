class A
{
	public int add(int...args)
	{
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			sum=sum+args[i];
		}
		return sum;
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a=new A();
		System.out.println("Addition of 10+20 : "+a.add(10,20));
		System.out.println("Addition of 10+20+30 : "+a.add(10,20,30));
		System.out.println("Addition of 10+20+30+40 : "+a.add(10,20,30,40));
		System.out.println("Addition of 10+20+30+40+50 : "+a.add(10,20,30,40,50));
		System.out.println("Addition of 0 : "+a.add());
	}
}