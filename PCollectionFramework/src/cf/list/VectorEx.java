package cf.list;

import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args)
	{
		Vector v=new Vector<>();
		
		v.add(1);
		v.add(1);
		v.add(2);
		v.add(null);
		v.add(22.7);
		v.add(null);
		v.add(new Test());
		v.add("Sham Awachat");
		v.add("Kapil");
		v.add("Bit2");
		v.add("Yeotmal");
		
		System.out.println("Vector Elements:\n"+v);
		System.out.println("Capacity:\n"+v.capacity());
		System.out.println("Size:\n"+v.size());
		System.out.println("======================================");
		
		int n=(int)v.get(2);
		System.out.println("Index 2 squared: "+n*n);
		
		Test t=(Test)v.get(6);
		t.show();
		
//		System.out.println(v.contains("Sham Awachat"));
		boolean res=v.contains("Kapil");
		System.out.println("True/False: "+res);
		
		v.remove("Sham Awachat");
		System.out.println("Vector Elements:\n"+v);
		
		v.set(7, "Sham");
		System.out.println("Vector Elements:\n"+v);
		
		v.add(7, "Kapil");
		System.out.println("Vector Elements:\n"+v);
		
		System.out.println("Printing Vector Elements using for-loop:");
		for(int i=0;i<v.size();i++)
		{
			System.out.print(v.get(i)+" | ");
		}
		System.out.println();
		System.out.println("---------------------------------------");
		
		System.out.println("Printing Vector Elements using for-each-loop:");
		for(Object ob:v)
		{
			System.out.print(ob+" | ");
		}
		System.out.println();
		System.out.println("---------------------------------------");
	}
	
}

class Test
{
	public void show()
	{
		System.out.println("In show() of Test class!");
	}
}
