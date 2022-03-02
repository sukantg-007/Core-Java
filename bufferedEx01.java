import java.io.*;

class Test
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number : ");
		String s1=br.readLine();
		int val=Integer.parseInt(s1);
		if (val %2==0)
		{
			System.out.println("Given number "+val+" is even");
		}else
		{
			System.out.println("Given number "+val+" is odd");
		}

	}
}