import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		HashMap hm=new HashMap();
		hm.put(1,"AAA");
		hm.put(2,"BBB");
		hm.put("CCC",3);
		hm.put("DDD",4);
		System.out.println(hm);
		System.out.println(hm.get(1));
		System.out.println(hm.remove("CCC"));
		System.out.println(hm);
	}
}
