import java.io.*;
class Test 
{
	public static void main(String[] args)throws IOException 
	{
		File f=new File("C:\\Users\\Vedanta-PC02\\Desktop\\student\\java900\\file handling");		
		String[] fList=f.list();
		for(String s: fList)
		{
			System.out.println(s);
		}
	}
}
