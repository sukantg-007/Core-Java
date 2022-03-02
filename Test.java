1.
class Test 
{
	public static void main(String[] args) 
	{
		int i=10;
		int j;
		if(i==10)
		{
			j=20;
		}
		System.out.println(j);
	}
}

options:
1. Compilation Error
2. 0
3. 20
4. 10

2.
class Test 
{
	public static void main(String[] args) 
	{
		int i=10;
		int j;
		if(i==10)
		{
			j=20;
		}
		else
		{
			j=30;
		}
		System.out.println(j);
	}
}

options:
1. Compilation Error
2. 0
3. 20
4. 30

3.
class Test 
{
	public static void main(String[] args) 
	{
		int i=10;
		int j;
		if(i==10)
		{
			j=20;
		}
		else if(i==20)
		{
			j=30;
		}
		System.out.println(j);
	}
}

options:
1. Compilation Error
2. 0
3. 20
4. 30

4.
class Test 
{
	public static void main(String[] args) 
	{
		int i=10;
		int j;
		if(i==10)
		{
			j=20;
		}
		else if(i==20)
		{
			j=30;
		}
		else
		{
			j=40
		}
		System.out.println(j);
	}
}

options:
1. Compilation Error
2. 40
3. 20
4. 30

5.
class Test 
{
	public static void main(String[] args) 
	{
		final int i=10;
		int j;
		if(i==10)
		{
			j=20;
		}
		
		System.out.println(j);
	}
}

options:
1. Compilation Error
2. 0
3. 20
4. 10

6.
class Test 
{
	public static void main(String[] args) 
	{
		int j;
		if(true)
		{
			j=20;
		}
		
		System.out.println(j);
	}
}

options:
1. Compilation Error
2. 0
3. 20
4. Runtime Error