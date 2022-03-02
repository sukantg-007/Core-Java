import java.lang.reflect.*;
class A
{
	
	/*A(int x)
	{
	//unreported exception InstantiationException; must be caught or declared to be thrown
	}
	*/
	/*private A()
	{
		//IllegalAccessException: Class Test can not access a member of class A with modifie
	}
	*/
	static
	{
		System.out.println("Bytecode laoding");
	}
	public void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		System.out.println("m2");
	}
	public void m3()
	{
		System.out.println("m3");
	}
}
class Test
{
	public static void main(String[] args)throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		Class c=Class.forName("A");
		/*
		System.out.println("Class Name :"+c.getName());
		System.out.println("Class Modifier :"+c.getModifiers());
		Method[] methods=c.getMethods();
		for(Method m: methods)
			System.out.println(m.getName());
		System.out.println("Super class name : "+c.getSuperclass());
		*/
		Object o=c.newInstance();

		A a1=(A)o;
		a1.m1();
	}
}