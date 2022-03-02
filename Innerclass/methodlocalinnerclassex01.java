//method local inner classes
class Test
{
	public void m1()
	{
		class Add
		{
			public int add(int...x)
			{
				int sum=0;
				for (int i: x)
				{
					sum=sum+i;
				}
					return sum;
			}

			public float add(float...x)
			{
				float sum=0;
				for (float i: x)
				{
					sum=sum+i;
				}
					return sum;
			}
		}

		Add a=new Add();

		System.out.println(" Addition of  10 +20 "+a.add(10,20));
		System.out.println(" Addition of  10.5 +20.4 "+a.add(10.5f,20.4f));
		System.out.println(" Addition of  100 +200+300 "+a.add(100,200,300));
		System.out.println(" Addition of  60 +50 "+a.add(60,50));
		System.out.println(" Addition of  3.142 +2.5 "+a.add(3.142f,2.5f));
		System.out.println(" Addition of  77.77 +88.88 "+a.add(77.77f,88.88f));
	}

	public static void main(String[] args)
	{
		Test t=new Test();
		t.m1();
	}
}