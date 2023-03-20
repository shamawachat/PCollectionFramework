package cf.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm=new TreeMap<>();
		
		tm.put(23, "Satara");
		tm.put(12, "Nagpur");
		tm.put(2, "Bhopal");
		tm.put(61, "Lucknow");
		tm.put(4, "Pune City");
		tm.put(19, "Amravati");
		tm.put(54, "Chandrapur");
//		tm.put(43, null);
		tm.put(49, "Girad");
//		tm.put(29, null);
//		tm.put(null, "Wardha");
		Object obj=tm.put(43, "Bhandara");
		
		System.out.println("TreeMap Elements:\n"+tm);
//		System.out.println("Capacity:\n"+tm.capacity());
		System.out.println("Size:\n"+tm.size());
		System.out.println("-------------------------------------------");
		
		System.out.println(obj);
		
		Map.Entry entry=tm.ceilingEntry(22);
		System.out.println("Ceiling Entry: "+entry);
		entry=tm.floorEntry(22);
		System.out.println("Floor Entry: "+entry);
		Map m=tm.subMap(3, 55);
		System.out.println("SubMap: "+m);
		
		for(Map.Entry en:tm.entrySet())
		{
			System.out.println("EntrySet: "+en);
		}
		
		System.out.println("KeySet: "+tm.keySet());
		System.out.println("KeyValue: "+tm.values());
		
		String s=tm.get(4);
		System.out.println("Index: "+s);
		
		Integer n=tm.keySet().stream().filter(K->K>20).findAny().orElse(null);
		System.out.println(n);
		
		s=tm.values().stream().filter(V->V.contains("nd")).findAny().orElse(null);
		System.out.println(s);
	}
}
