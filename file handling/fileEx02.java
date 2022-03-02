import java.io.*;
class Test 
{
	public static void main(String[] args)throws IOException 
	{
		File f=new File("abc");		
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
		f.delete();
		System.out.println(f.exists());
	}
}
