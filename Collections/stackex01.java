import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		Stack s=new Stack();
		s.add(10);
		s.add(20);
		s.add(30);
		System.out.println(s);
		s.push(40);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s);
	}
}
