/* to stop execution of thread
	yield()
	join()
	sleep()
*/

class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("Thread : "+Thread.currentThread().getName());
		for (int i=0;i<1000 ; i++)
		{
			Thread.yield();
			System.out.println(i);
		}
	}
}
class  Test
{
	public static void main(String[] args) 
	{
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		System.out.println("Thread : "+Thread.currentThread().getName());
		System.out.println("Hello World!");
	}
}
