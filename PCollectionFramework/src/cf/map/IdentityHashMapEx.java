package cf.map;

import java.util.IdentityHashMap;

public class IdentityHashMapEx 
{
	public static void main(String[] args) 
	{
		String str1=new String("Sham");
		String str2=new String("Sham");
		
		IdentityHashMap ihm=new IdentityHashMap<>();
		
		ihm.put(1, "Crush the bone");
		ihm.put(str1, "Wardha");
		ihm.put(str2, "Nagpur");
		ihm.put(1, "Checking heterogeneous element");
		ihm.put(1.2, null);
		ihm.put(null, "Hey!");
		ihm.put(null, "Hello!");
		
		System.out.println("LinkedHashMap Elements:\n"+ihm);
//		System.out.println("Capacity:\n"+ihm.capacity());
		System.out.println("Size:\n"+ihm.size());
		System.out.println("-------------------------------------------");
	}
}
