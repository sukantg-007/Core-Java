class Arithmetic
{
	public void add(int x, int y)
	{
		System.out.println(x+y);
	}

	public int add(int x, int y)
	{
		return x+y;
	}
	

	public float add(float x, float y)
	{
		return x+y;
	}
	public String add(String x, String y)
	{
		return x+y;
	}
}
class Test
{
	public static void main(String[] args)
	{
		Arithmetic a=new Arithmetic();
		System.out.println("Addition of 10+20 : "+a.add(10,20));
		
		/*System.out.println("Addition of 11.2+22.4 : "+a.add(11.2f,22.4f));
		System.out.println("Concatination of abc+def : "+a.add("abc","def"));
		System.out.println("Addtion of 10.2+20.2: "+a.add(10.2,20.2));
		*/
	}
}