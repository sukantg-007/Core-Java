import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(15);
		hs.add("Hi");
		hs.add(true);
	System.out.println(hs.add(3.14f));
		System.out.println(hs.add(10));
		System.out.println(hs);
	}
}
