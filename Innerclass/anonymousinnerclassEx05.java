class A implements Runnable
{
	public void run()
	{
		for (int i=0; i<5; i++)
		{
			System.out.println("child thread");
		}

	}
}
class Test
{
	public static void main(String[] args)
	{
		A a=new A();//create a job
		Thread t=new Thread(a);
		t.start();
		//job of main thread
		for (int i=0; i<5;i++ )
		{
			System.out.println("main thread");
		}
	}
}