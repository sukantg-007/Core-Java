//area of circle
import java.util.*;

class AreaCircle
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter redius : ");
		int radius=sc.nextInt();

		float area=(float)Math.PI*(float)Math.pow(radius,2);

		System.out.println("Area of circle : "+area);
	}
}
