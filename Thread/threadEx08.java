class MyThread extends Thread
{
	public void run()
	{
		for (int i=0; i<10; i++)
		{
			System.out.println("Child Thread");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
			}
		}
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
		t.setDaemon(true);
		t.start();
		for (int i=0;i<10; i++)
		{
			System.out.println("main-thread");
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
			}
		}
	}
}
