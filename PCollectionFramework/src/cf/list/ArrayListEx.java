package cf.list;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListEx 
{
	public static void main(String[] args) 
	{
		ArrayList ar=new ArrayList<>();
		
		ar.add(1);
		ar.add(1);
		ar.add(2);
		ar.add(null);
		ar.add(22.7);
		ar.add(null);
		ar.add(new Test());
		ar.add("Sham Awachat");
		ar.add("Kapil");
		ar.add("Bit2");
		ar.add("Yeotmal");
		
		System.out.println("Array Elements:\n"+ar);
//		System.out.println("Capacity:\n"+ar.capacity());
		System.out.println("Size:\n"+ar.size());
		System.out.println("======================================");
	}
}
