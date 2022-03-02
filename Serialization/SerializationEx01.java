import java.io.*;
class Dog implements Serializable
{
	int i=10;
	int j=20;
}
class Test
{
	public static void main(String[] args)throws Exception
	{
		Dog d=new Dog();
		//serialization
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		//de-serialization
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d1=(Dog)ois.readObject();

		System.out.println(d1.i+"..."+d1.j);
	}
}