class Test
{
	public static final int MIN_VALUE=1;
	public static final int MAX_VALUE=10000;
	public final int OTHER_NUM=456;

	public static void main(String[] args)
	{
		System.out.println("Minum value : "+MIN_VALUE);
		System.out.println("Maximum value : "+MAX_VALUE);
		System.out.println("Other value : "+new Test().OTHER_NUM);
	}
}
class DemoTest
{
	public static void main(String[] args)
	{
		//Test.MIN_VALUE=300;
		final int a=900;
		System.out.println(Test.MIN_VALUE);
		System.out.println(Test.MAX_VALUE);
		System.out.println(new Test().OTHER_NUM);
		a=700;
		System.out.println("Local final variable : "+a);
	}
}