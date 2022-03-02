class Outer
{
	class Inner
	{
		public void m1()
		{
			System.out.println("m1-Inner");
		}
		
	}

	public static void main(String[] args)
		{
			Outer o=new Outer();
			Outer.Inner i=o.new Inner();
			i.m1();
		}
}