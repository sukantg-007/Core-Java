interface MyInterface
{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
	void m6();
	void m7();
}

class MyInterfaceAdapter implements MyInterface
{
	public void m1(){}
	public void m2(){}
	public void m3(){}
	public void m4(){}
	public void m5(){}
	public void m6(){}
	public void m7(){}
}

class A extends MyInterfaceAdapter
{
	public void m1()
	{
		System.out.println("m1-A");
	}
}