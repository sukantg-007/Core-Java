abstract class Vehicle
{
	public abstract int getNoofWheels();//incomplete method

	public void m1()
	{
		System.out.println("Hello");
	}
}
class Rikshaw extends Vehicle
{
	public int getNoofWheels()
	{
		return 3;
	}
}
class Car extends Vehicle
{
	public int getNoofWheels()
	{
		return 4;
	}
}
//main class
class Test
{
	public static void main(String[] args)
	{
		//Vehicle v=new Vehicle(); //Vehicle is abstract; cannot be instantiated
		Rikshaw r= new Rikshaw();
		System.out.println("Rikshaw has no of Wheels : "+r.getNoofWheels());

		Car c= new Car();
		System.out.println("Car has no of Wheels : "+c.getNoofWheels());
	}
}