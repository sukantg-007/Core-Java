class MyThread extends Thread
{
	public void run()
	{
		int mult=1;
		for (int i=1; i<=10; i++)
		{
			mult=mult*i;
		}
		System.out.println("ChildThread : Multiplication (1-10) : "+mult);
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
		t.start();
		int add=0;
		for (int i=1; i<=10; i++)
		{
			add=add+i;
		}
		System.out.println("MainThread: Addition (1-10) : "+add);
	}
}
