class MyException extends RuntimeException
{
	MyException(String msg)
	{
		super(msg);
	}
}
class Test
{
	public static void main(String[] args)
	{
		throw new MyException("Yanna Raskala");
	}
}