class Test 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Java");
		StringBuffer sb2=sb.append(" Programming");
		System.out.println(sb.hashCode());
		System.out.println(sb2.hashCode());
	}
}
