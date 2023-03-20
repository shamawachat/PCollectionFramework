package cf.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapEx 
{
	public static void main(String[] args) 
	{
		Person p1=new Person(1, "Sham", 28);
		Person p2=new Person(2, "Akshat", 23);
		Person p3=new Person(3, "Daksh", 21);
		
		HashMap hm=new HashMap();
		
		hm.put(p1.getId(), p1+"\n");
		hm.put(p2.getId(), p1+"\n");
		hm.put(3, "Susmit"+"\n");
		hm.put(null, "To check\n");
		hm.put(null, "why to check\n");
		hm.put("Nagpur", "Maharashtra\n");
		hm.put("0.12", 1123+"\n");
		hm.put("Indore", "Madhyapradesh\n");
		
		System.out.println("HashMap Elements:\n"+hm);
//		System.out.println("Capacity:\n"+hm.capacity());
		System.out.println("Size:\n"+hm.size());
		System.out.println("-------------------------------------------");
		
		Set s=hm.keySet();
		System.out.println("Key Elements:\n"+s);
		System.out.println("-------------------------------------------");
		Collection val=hm.values();
		System.out.println("Key Values:\n"+val);
		System.out.println("-------------------------------------------");
		
		boolean res=hm.containsKey(1);
		System.out.println("Result:\n"+res);
		
		res=hm.containsValue("Maharashtra\n");
		System.out.println("Result:\n"+res);
		
		Object ob=hm.get(3);
		System.out.println(ob);
	}
}

class Person
{
	private int id;
	private String name;
	private int age;
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
