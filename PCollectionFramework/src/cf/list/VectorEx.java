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
	}
	
}

class Test
{
	public void show()
	{
		System.out.println("In show() of Test class!");
	}
}
