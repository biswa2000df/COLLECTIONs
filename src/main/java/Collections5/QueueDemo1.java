package Collections5;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue q=new PriorityQueue();
		//does not allow heterogeneous data,insertation order preserved,duplication allow
		//Insert element in add() and offer()
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");
		System.out.println(q);
		//using element() & peek() get the head data
//		SYSTEM.OUT.PRINTLN(Q.ELEMENT());//A  //IF THE ELEMENT IS NOT PRESENT IN THE QUEUE JAVA.UTIL.NOSUCHELEMENTEXCEPTION
//		SYSTEM.OUT.PRINTLN(Q.PEEK());//A		//NULL
//		
		//using remove() & poll()
//		System.out.println(q.remove());  //A
//		System.out.println(q);//[B, C, C]
		System.out.println(q.poll());  //A    		//IF THE ELEMENT IS NOT PRESENT IN THE QUEUE JAVA.UTIL.NOSUCHELEMENTEXCEPTION
		System.out.println(q);//[B, C, C]			//NULL
		
		
		
		
		

	}

}
