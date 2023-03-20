package cf.queue;

import java.util.PriorityQueue;

public class PriorityQueueEx 
{
	public static void main(String[] args) 
	{
		PriorityQueue pq=new PriorityQueue<>();
		
		pq.offer("Sahra");
//		pq.offer(1);
		pq.offer("RAm");
		pq.offer("Ganesh");
		pq.offer("Raj");
		pq.offer("RAm");
		pq.offer("RAm");
		pq.offer("RAm");
		pq.offer("RAm");
		pq.offer("RAm");
		pq.offer("RAm");
		pq.offer("RAm");
		pq.offer("RAm");
		pq.offer("RAm");
		
		System.out.println("PriorityQueue Elements:\n"+pq);
//		System.out.println("Capacity:\n"+pq.capacity());
		System.out.println("Size:\n"+pq.size());
		System.out.println("-------------------------------------------");
		
		Object s=pq.peek();
		System.out.println("Peek Element: "+s);
		System.out.println("PriorityQueue Elements:\n"+pq);
		
		s=pq.poll();
		System.out.println("Poll Element: "+s);
		System.out.println("PriorityQueue Elements:\n"+pq);
	}
}
