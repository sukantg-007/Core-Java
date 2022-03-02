import java.io.*;
class Test 
{
	public static void main(String[] args)throws IOException 
	{
		File f=new File("C:\\Users\\Vedanta-PC02\\Desktop\\student\\java900\\file handling");
		int folderCount=0;
		int fileCount=0;
		String[] fList=f.list();
		for(String s: fList)
		{
			File check=new File(f, s);
			if(check.isFile()){
			System.out.println("File-Name : "+s);
			fileCount++;
			}else if(f.isDirectory()){
			System.out.println("Folder-Name : "+s);
			folderCount++;
			}
		}
		System.out.println("-------------------");
		System.out.println("Foleder : "+folderCount);
		System.out.println("Files : "+fileCount);
	}
}
