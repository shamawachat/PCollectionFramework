package cf.set;

import java.util.HashSet;

//import cf.list.Test;

public class HashSetEx 
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet<>();
		
		hs.add(1);
		hs.add(1);
		hs.add(2);
		hs.add(null);
		hs.add(22.7);
		hs.add(null);
//		hs.add(new Test());
		hs.add("Sham Awachat");
		hs.add("Kapil");
		hs.add("Bit2");
		hs.add("Yeotmal");
		
		System.out.println("HashSet Elements:\n"+hs);
//		System.out.println("Capacity:\n"+hs.capacity());
		System.out.println("Size:\n"+hs.size());
		System.out.println("======================================");
		
		boolean res=hs.contains("Sham Awachat");
		System.out.println("Result: "+res);
		
		hs.add(true);
		hs.add(false);
		hs.add("false");
		hs.add("true");
		System.out.println("HashSet Elements:\n"+hs);
	}
}
