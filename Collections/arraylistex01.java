import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Hi");
		al.add(true);
		al.add(null);
		Object[] o=al.toArray();
		System.out.println(o.length);
	}
}
