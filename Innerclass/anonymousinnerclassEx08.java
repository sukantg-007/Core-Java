class Test
{
	public static void main(String[] args)
	{	
		Thread t=new Thread(new Runnable(){
			public void run()
			{
				for (int i=0; i<5; i++)
				{
					System.out.println("child thread");
				}

			}
		});
		t.start();
		//job of main thread
		for (int i=0; i<5;i++ )
		{
			System.out.println("main thread");
		}
	}
}