import java.io.*;
class Test 
{
	public static void main(String[] args)throws IOException 
	{
		File f=new File("abc");				
		f.mkdir();
		File f1=new File("D:\\FileDemo","abc.txt");
		f1.createNewFile();
		System.out.println(f1.exists());
	}
}
