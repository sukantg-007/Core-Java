import java.io.*;
class Test
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number : ");
		String s1=br.readLine();
		int val1=Integer.parseInt(s1);


		System.out.println("Enter Second number : ");
		String s2=br.readLine();
		int val2=Integer.parseInt(s2);

		System.out.println("Addition is : "+(val1+val2));
	}
}