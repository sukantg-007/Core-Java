import p1.AccessModifier;
class Test extends AccessModifier
{
	public static void main(String[] args)
	{
		//AccessModifier am2= new AccessModifier();
		Test t= new Test();
		t.m1();
		//am2.m2();methodEx03.java:8: error: m2() has private access in AccessModifier
		//am2.m3();ethodEx03.java:9: error: m3() is not public in AccessModifier; cannot be accessed from outside package
		//am2.m4();methodEx03.java:10: error: m4() has protected access in AccessModifier
		t.m4();
	}
}