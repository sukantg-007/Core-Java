import java.io.*;
import java.util.*;
class ArrayDemo 
{
	public static void main(String[] args)throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] a, b, c;
		a=new int[2];
		b=new int[3];
		c=new int[4];
		System.out.println("Enter 2 numbers : ");
		for (int i=0; i<a.length;i++ )
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Enter 3 numbers for b");
		for (int i=0; i<b.length; i++)
		{
			b[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("array a :");
		for (int i:a )
		{
			System.out.println(i);
		}

		System.out.println("array b :");
		for (int i:b )
		{
			System.out.println(i);
		}
	}
}
