import java.io.*;
class Test
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter side of square : ");
		String s1=br.readLine();
		int side=Integer.parseInt(s1);

		int area=(int)Math.pow(side,2);
		System.out.println("Area of square : "+area);
	}
}