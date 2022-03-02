class MyThread extends Thread
{
	public void run()
	{	
		System.out.println("Child Thread : "+Thread.currentThread().getName()+"..Priority : "+Thread.currentThread().getPriority());
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		Thread.currentThread().setPriority(7);
		MyThread t=new MyThread();
		t.setName("AAA");
		t.start();//it executes run() method present in Thread class
		MyThread t1=new MyThread();
		t1.start();
		
		System.out.println("main thread : "+Thread.currentThread().getName()+"...Priority: "+Thread.currentThread().getPriority());
	}
}
/*
public static final int MIN_PRIORITY=1;
  public static final int NORM_PRIORITY=5;
  public static final int MAX_PRIORITy=10;
  */
