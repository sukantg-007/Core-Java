class Test
{
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer();
		System.out.println("Initial capacity : "+sb.capacity());
		sb.append("abcdefghijklmnooo");
		System.out.println("new  capacity : "+sb.capacity());
		sb.trimToSize();
		System.out.println("new  capacity : "+sb.capacity());
		sb.ensureCapacity(1000);
		System.out.println("new  capacity : "+sb.capacity());
		sb.insert(0,10);
		System.out.println(sb);
		sb.insert(1,11.2);
		System.out.println(sb);
	}
}

thread safe: at a time only one thread can access the methods which are synchronized
wating time of a thread increases..performance of a program decrease
public synchronized int length();
  public synchronized int capacity();
  public synchronized void ensureCapacity(int);
  public synchronized void trimToSize();
  public synchronized void setLength(int);
  public synchronized char charAt(int);
StringBuilder:
is same as StringBuffer

public void setLength(int);
  public void trimToSize();
  public void ensureCapacity(int);
  public int capacity();
  public int length();
non-synchronized