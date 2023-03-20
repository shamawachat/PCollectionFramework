package cf.map;

import java.util.LinkedHashMap;

public class LinkedHashMapEx 
{
	public static void main(String[] args) 
	{
		Person p1=new Person(1, "Sham", 28);
		Person p2=new Person(2, "Akshat", 23);
		Person p3=new Person(3, "Daksh", 21);
		
		LinkedHashMap lhm=new LinkedHashMap<>();
		
		lhm.put(p1.getId(), p1+"\n");
		lhm.put(p2.getId(), p1+"\n");
		lhm.put(3, "Susmit"+"\n");
		lhm.put(null, "To check\n");
		lhm.put(null, "why to check\n");
		lhm.put("Nagpur", "Maharashtra\n");
		lhm.put("0.12", 1123+"\n");
		lhm.put("Indore", "Madhyapradesh\n");
		
		System.out.println("LinkedHashMap Elements:\n"+lhm);
//		System.out.println("Capacity:\n"+hm.capacity());
		System.out.println("Size:\n"+lhm.size());
		System.out.println("-------------------------------------------");
	}
}
