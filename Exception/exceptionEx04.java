class Test
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Hello");
		}
		catch (java.io.IOException  e)
		{
			e.printStackTrace();
		}
	}
}

exceptionEx04.java:9: error: exception IOException is never thrown in body of corresponding try statement
                catch (java.io.IOException  e)
                ^
1 error
