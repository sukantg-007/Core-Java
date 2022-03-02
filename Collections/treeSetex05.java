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
		Collections.sort(al, new MyComparator(){
			public int compare(Integer I1, Integer I2)
			{		
				return I1>I2?-1:I1<I2?1:0;
	
			}
		});
		System.out.println(al);
	}
}
/*
class MyComparator implements Comparator<Integer>
{
	public int compare(Integer I1, Integer I2)
	{		
		return I1>I2?-1:I1<I2?1:0;
		if(I1>I2)
			return -1;
		else if(I1<I2)
			return 1;
		else
			return 0;
			
	}
	}

*/