import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);		
		System.out.println(al);
		/*for (Object o:al)
		{
			System.out.println((Integer)o);
		}
		*/
		Iterator<Integer> itr=al.iterator();
		int sum=0;
		while(itr.hasNext())
		{
			int val=itr.next();
			System.out.println(val);
			sum=sum+val;
		}
		System.out.println("Sum : "+sum);
	}
}

