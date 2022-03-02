class Test
{
	public static void main(String[] args)
	{
		Runnable a=new Runnable(){
			public void run()
			{
				for (int i=0; i<5; i++)
				{
					System.out.println("child thread");
				}

			}
		};//create a job
		Thread t=new Thread(a);
		t.start();
		//job of main thread
		for (int i=0; i<5;i++ )
		{
			System.out.println("main thread");
		}
	}
}