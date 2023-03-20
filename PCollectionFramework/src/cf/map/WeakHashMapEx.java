package cf.map;

import java.util.WeakHashMap;

public class WeakHashMapEx 
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		
		WeakHashMap whm=new WeakHashMap<>();
		whm.put(d, "Object used!");
		
		System.out.println("WeakHashMap Elements:\n"+whm);
//		System.out.println("Capacity:\n"+whm.capacity());
		System.out.println("Size:\n"+whm.size());
		System.out.println("-------------------------------------------");
		
		d=null;
		
		try 
		{
			Thread.sleep(2000);
		} 
		catch(InterruptedException e) 
		{
			System.out.println(e);
		}
		
		System.gc();
		System.out.println("WeakHashMap Elements:\n"+whm);
	}
}

class Demo
{
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("finalize() of Demo class!");
	}
	
	@Override
	public String toString() 
	{
		return getClass().getName();
	}
}
