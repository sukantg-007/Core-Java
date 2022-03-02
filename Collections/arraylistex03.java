import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		int val;
		for (int i=0;i<5; i++)
		{
			System.out.print("Enter value : ");
			val=sc.nextInt();
			al.add(val);

		}
		System.out.println("Given array list is : ");
		int sum=0;
		/*for (Integer i:al )
		{
			sum=sum+i;
			System.out.println(i);

		}
		*/
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Integer newval=(Integer)itr.next();
			sum=sum+newval;
			System.out.print("\t"+newval);

		}
		System.out.println("");
		System.out.println("Addition of elements : "+sum);

		LinkedList ll=new LinkedList(al);
		System.out.println(ll);
		ll.add(3, 77);
		System.out.println(ll);
	}
}
