//addition of two numbers 
import java.util.*;
class Addition
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int val1=sc.nextInt();

		System.out.print("Enter 2nd number : ");
		int val2=sc.nextInt();

		int add=val1+val2;
		System.out.println("Addition is : "+add);
	}
}