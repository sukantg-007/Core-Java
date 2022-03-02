class Test
{
	public static void main(String[] args)
	{
		l1:
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if (i==j)
					break l1;
				System.out.println(i+"..."+j);
				
			}
		}
	}
}