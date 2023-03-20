package cf.list;

import java.util.Stack;

public class StackEx 
{
	public static void main(String[] args) 
	{
		Stack s=new Stack<>();
		
		s.push(1);
		s.push(1);
		s.push(2);
		s.push(null);
		s.push(22.7);
		s.push(null);
		s.push(new Test());
		s.push("Sham Awachat");
		s.push("Kapil");
		s.push("Bit2");
		s.push("Yeotmal");
		
		System.out.println("Stack Elements:\n"+s);
		System.out.println("Capacity:\n"+s.capacity());
		System.out.println("Size:\n"+s.size());
		System.out.println("======================================");
		
//		System.out.println("Last Element: "+s.peek());
		
		Object o=s.peek();
		System.out.println("Last Element: "+o);
		System.out.println("Stack Elements:\n"+s);
		
		o=s.pop();
		System.out.println("Last Element: "+o);
		System.out.println("Stack Elements:\n"+s);
	}
}
