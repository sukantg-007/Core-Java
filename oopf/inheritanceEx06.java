class A
{
	A()
	{
		System.out.println("A-con");//27....3
	}
	{//16
		System.out.println("IB-A");//25....1
	}
	int m1()//17
	{
		System.out.println("m1-A");//26...2
		return 10;
	}
	int i=m1();//18
	static//1
	{
		System.out.println("SB-A");//10
	}
	static int m2()//2
	{
		System.out.println("static-m2-A");//11
		return 20;
	}
	static int j=m2();//3
}
class B extends A
{
	static//4
	{
		System.out.println("SB-B");//12
	}
	static int m4()//5
	{
		System.out.println("static-m4-B");//13
		return 40;
	}
	static int l=m4();//6

	B()
	{
		System.out.println("B-con");//30...6
	}
	{//19
		System.out.println("IB-B");//28...4
	}
	int m3()//20
	{
		System.out.println("m3-B");//29...5
		return 30;
	}
	int k=m3();//21
}
class C extends B
{
	C()
	{
		System.out.println("C-con");//33...9
	}
	{//22
		System.out.println("IB-C");//31...7
	}
	static//7
	{
		System.out.println("SB-C");//14
	}

	int m5()//23
	{
		System.out.println("m5-C");//32...8
		return 50;
	}
	static int m6()//8
	{
		System.out.println("static-m6-C");//15
		return 60;
	}
	int m=m5();//24
	static int n=m6();//9
}

class Test
{
	public static void main(String[] args)throws ClassNotFoundException
	{
		C c=new C();
	}
}