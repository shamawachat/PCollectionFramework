package cf.list;

import java.util.ArrayList;
import java.util.Iterator;
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
		
		System.out.println("ArrayList Elements:\n"+ar);
//		System.out.println("Capacity:\n"+ar.capacity());
		System.out.println("Size:\n"+ar.size());
		System.out.println("======================================");
		
		System.out.println("Using for-loop:");
		for(int i=0;i<ar.size();i++)
		{
			System.out.print(ar.get(i)+" | ");
		}
		System.out.println("--------------------------------------");
		
		System.out.println("Using for-each-loop:");
		for(Object ob:ar)
		{
			System.out.print(ob+" ");
		}
		System.out.println("--------------------------------------");
		
		ar.set(0, "Sham");
		System.out.println("Updated ArrayList: "+ar);
		
		ar.remove(3);
		System.out.println("Updated ArrayList: "+ar);
		
		boolean res=ar.contains("Sham");
		System.out.println("True/False: "+res);
		
		int ind=ar.indexOf("Sham Awachat");
		System.out.println("Index: "+ind);
		
		ar.add("Sham");
		System.out.println("Updated ArrayList: "+ar);
		
		ind=ar.lastIndexOf("Sham");
		System.out.println("Index: "+ind);
		
		System.out.println("Using Iterator:");
		Iterator itr=ar.iterator();
	}
}
