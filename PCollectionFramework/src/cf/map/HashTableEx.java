package cf.map;

import java.util.Hashtable;

public class HashTableEx 
{
	public static void main(String[] args) 
	{
		Hashtable ht=new Hashtable<>();
		
		ht.put(new Test(25), "Mohini");
		ht.put(new Test(98), "Ramesh");
		ht.put(new Test(36), "Sham");
		ht.put(new Test(12), "Kamal");
		ht.put(new Test(53), "Anu");
		ht.put(new Test(79), "Cat");
		ht.put(new Test(48), "Ram");
		ht.put(new Test(43), "Amar");
		ht.put(new Test(39), "Ketan");
		
		System.out.println("Hashtable Elements:\n"+ht);
//		System.out.println("Capacity:\n"+ht.capacity());
		System.out.println("Size:\n"+ht.size());
		System.out.println("-------------------------------------------");
	}
}

class Test
{
	private int a;

	public Test(int a) 
	{
		this.a = a;
	}
	
	@Override
	public int hashCode() 
	{
		return a%11;
	}

	@Override
	public String toString() 
	{
		return a+" ";
	}
}
