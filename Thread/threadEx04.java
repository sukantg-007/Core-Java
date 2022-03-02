class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Child Thread : "+Thread.currentThread().getName());
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
		t.setName("AAA");
		t.start();//it executes run() method present in Thread class
		MyThread t1=new MyThread();
		t1.start();
		Thread.currentThread().setName("Rajnikant");
		System.out.println("main thread : "+Thread.currentThread().getName());
	}
}
