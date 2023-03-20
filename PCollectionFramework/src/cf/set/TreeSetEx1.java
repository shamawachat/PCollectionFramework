package cf.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx1 
{
	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet(new MyComparator());
		
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
		
		System.out.println("TreeSet Elements:\n"+ts);
//		System.out.println("Capacity:\n"+ts.capacity());
		System.out.println("Size:\n"+ts.size());
		System.out.println("-------------------------------------------");
	}
}

class MyComparator implements Comparator
{
	@Override
	public int compare(Object toBeInsertObj, Object insertedObj) 
	{
		System.out.println(toBeInsertObj+" | "+insertedObj);
		
		String s1=toBeInsertObj.toString();
		String s2=insertedObj.toString();
		
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		
		if(n1>n2)
		{
			return -1;
		}
		else if(n1<n2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}