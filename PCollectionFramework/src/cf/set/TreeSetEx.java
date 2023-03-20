package cf.set;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx 
{
	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet<>();
		
		ts.add(1);
		ts.add(1);
		ts.add(2);
		ts.add(21);
		ts.add(43);
		ts.add(51);
		ts.add(11);
		ts.add(9);
		ts.add(56);
		ts.add(14);
		ts.add(54);
//		ts.add(null);
//		ts.add(22.7);
//		ts.add(null);
//		ts.add(new Test());
//		ts.add("Sham Awachat");
//		ts.add("Kapil");
//		ts.add("Bit2");
//		ts.add("Yeotmal");
		
		System.out.println("TreeSet Elements:\n"+ts);
//		System.out.println("Capacity:\n"+ts.capacity());
		System.out.println("Size:\n"+ts.size());
		System.out.println("-------------------------------------------");
		
		NavigableSet ns=ts;
		int n=(int)ns.ceiling(15);
		System.out.println("Ceiling Number: "+n);
		n=(int)ns.floor(15);
		System.out.println("Floor Number: "+n);
		
		Set st=ns.subSet(3, 55);
		System.out.println("SubSet Elements: "+st);
		st=ns.headSet(13);
		System.out.println("HeadSet Elements: "+st);
		st=ns.tailSet(13);
		System.out.println("TailSet Elements: "+st);
	}
}
