class MyRunnable implements Runnable
{
	public void run()
	{
		for (int i=0; i<10; i++)
		{
			System.out.println("Child Thread : "+Thread.currentThread().getName());
		}
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		MyRunnable job=new MyRunnable();
		Thread t=new Thread(job);
		t.setName("Rajanikant");
		t.start();

		for (int i=0; i<10; i++)
		{
			System.out.println("main thread : "+Thread.currentThread().getName());
		}
	}
}
