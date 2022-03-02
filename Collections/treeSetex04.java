import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);
		System.out.println(t);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Integer I1=(Integer)o1;
		Integer I2=(Integer)o2;
		return I1>I2?-1:I1<I2?1:0;
		/*if(I1>I2)
			return -1;
		else if(I1<I2)
			return 1;
		else
			return 0;
			*/
	}
}
