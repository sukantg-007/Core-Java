//reverse of a number
import java.util.*;

class Reverse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		byte val=sc.nextByte();
		byte b=10;
		int rev=0;
		while(val>0)
		{
			rev=rev*10+val%10;
			val=(byte)(val/b);
		}
		System.out.println("Reverse : "+rev);
	}
}
