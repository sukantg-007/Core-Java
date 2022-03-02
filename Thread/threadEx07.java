/* to stop execution of thread
	yield()
	join()
	sleep()
*/

class MyRunnable implements Runnable
{
	static Thread mainThread;//static int a;
	public void run()
	{
		try{
			mainThread.join();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Thread : "+Thread.currentThread().getName());
		for (int i=0;i<1000 ; i++)
		{
			System.out.println(i);
		}
	}
}
class  Test
{
	public static void main(String[] args) throws InterruptedException
	{
		MyRunnable.mainThread=Thread.currentThread();

		MyRunnable r=new MyRunnable();

		Thread t=new Thread(r);		

		t.start();		

		System.out.println("Thread : "+Thread.currentThread().getName());

		for (int i=1;i<255 ; i++)
		{
			System.out.println((char)i);
		}
	}
}
