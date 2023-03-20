package cf.set;

//import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetEx 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet<>();
		
		lhs.add(1);
		lhs.add(1);
		lhs.add(2);
		lhs.add(null);
		lhs.add(22.7);
		lhs.add(null);
//		hs.add(new Test());
		lhs.add("Sham Awachat");
		lhs.add("Kapil");
		lhs.add("Bit2");
		lhs.add("Yeotmal");
		
		System.out.println("LinkedHashSet Elements:\n"+lhs);
//		System.out.println("Capacity:\n"+hs.capacity());
		System.out.println("Size:\n"+lhs.size());
		System.out.println("======================================");
		
		boolean res=lhs.contains("Sham Awachat");
		System.out.println("Result: "+res);
		
		lhs.add(true);
		lhs.add(false);
		lhs.add("false");
		lhs.add("true");
		System.out.println("HashSet Elements:\n"+lhs);
	}
}
