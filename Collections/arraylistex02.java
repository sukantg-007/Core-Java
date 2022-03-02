import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		//al.add("Hi");
		//al.add(true);
		int i=11;//autoboxing
		al.add(i);
		int b=al.get(0);//auto unboxing
		System.out.println(al);
	}
}
