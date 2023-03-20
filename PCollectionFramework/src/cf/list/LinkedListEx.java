package cf.list;

import java.util.LinkedList;

public class LinkedListEx 
{
	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList<>();
		
		ll.add(1);
		ll.add(1);
		ll.add(2);
		ll.add(null);
		ll.add(22.7);
		ll.add(null);
		ll.add(new Test());
		ll.add("Sham Awachat");
		ll.add("Kapil");
		ll.add("Bit2");
		ll.add("Yeotmal");
		
		ll.addFirst("I am the first");
		ll.addLast("I am the last");
		
		ll.add(13, 111);
		
		System.out.println("LinkedList Elements:\n"+ll);
//		System.out.println("Capacity:\n"+ll.capacity());
		System.out.println("Size:\n"+ll.size());
		System.out.println("======================================");
	}
}
