package Collections2;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add('X');
		l.add('Y');
		l.add('Z');
		l.add('A');
		System.out.println(l);
		LinkedList k=new LinkedList();
		System.out.println(k);
		k.addAll(l);
		System.out.println(k);
		System.out.println(l);
		l.add('B');
		System.out.println(l);
		k.removeAll(l);
		System.out.println(k);
		System.out.println(l);
		l.remove(3);
		System.out.println(l);
		
		Collections.shuffle(l);
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println(l);
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		
		
		

	}

}
