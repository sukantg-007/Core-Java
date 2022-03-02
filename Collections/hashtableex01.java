import java.util.*;
class Temp
{
	int i;
	Temp(int i)
	{
		this.i=i;
	}
	public int hashCode()
	{
		return i;
	}
	public String toString()
	{
		return i+"";
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		Hashtable table=new Hashtable();//default initial capacity :11
		table.put(new Temp(5),"A");
		table.put(new Temp(6),"C");
		table.put(new Temp(15),"D");
		table.put(new Temp(23),"E");
		table.put(new Temp(16),"F");
		System.out.println(table);
	}
}
