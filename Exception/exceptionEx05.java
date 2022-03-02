import java.io.*;
class Test
{
	public static void main(String[] args) throws FileNotFoundException
	{
		more();
	}
	public static void more() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("abc.txt");
	}
}

/*
exceptionEx05.java:10: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
                FileInputStream fis=new FileInputStream("abc.txt");
                                    ^
1 error
*/