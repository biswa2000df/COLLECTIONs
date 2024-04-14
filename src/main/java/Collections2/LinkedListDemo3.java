package Collections2;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("dog");
		l.add("dog");
		l.add("hen");
		l.add("goat");
		System.out.println(l);
		l.addFirst("tiger");
	l.addLast("beer");
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
	l.removeFirst();
	l.removeLast();
	System.out.println(l);
	Collections.sort(l,Collections.reverseOrder());
	System.out.println(l);
	
		
		

	}

}
