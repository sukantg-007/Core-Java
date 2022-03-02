import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		TreeMap tm=new TreeMap(new MyComparator());
		tm.put(5,"AAA");
		tm.put(9,"AAA");
		tm.put(4,"AAA");
		tm.put(7,"AAA");
		tm.put(3,"AAA");
		tm.put(1,"AAA");
		//tm.put("ZZZ",89);
		System.out.println(tm);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Integer I1=(Integer)o1;
		Integer I2=(Integer)o2;
		return I2.compareTo(I1);
	}
}
