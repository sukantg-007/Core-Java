import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Hello");
		al.add(3.25);
		al.add(true);
		int i=10;
		Integer i1=new Integer(12);
		al.add(i);//auboxing and auto unboxing
		al.add(i1);
		int i3=i1;
		System.out.println(i3);
		System.out.println(al);
	}
}
