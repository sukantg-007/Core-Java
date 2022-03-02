class Test 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1=new StringBuffer("Java");
		StringBuffer sb2=sb1.append("Java");
		StringBuffer sb3=sb2.append("Java");
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		System.out.println(sb3.hashCode());
	}
}
