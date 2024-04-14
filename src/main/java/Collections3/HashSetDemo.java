package Collections3;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	HashSet hs=new HashSet(100);
		//HashSet hs=new HashSet(100,(float)90.0);
	//	HashSet <Integer> hs=new HashSet<Integer>();
		HashSet hs=new HashSet();
		hs.add('A');
		hs.add("Welcome");
		hs.add(100);
		hs.add(true);
		hs.add(null);
		System.out.println(hs);
		hs.remove(null);
		System.out.println("After remove "+hs);
		System.out.println(hs.contains("Welcome"));
		System.out.println(hs.contains("Welcom"));
		System.out.println(hs.isEmpty());
		System.out.println("ForEach loop---------------------");
		for(Object o:hs)
		{
			
			System.out.println(o);
		}
		System.out.println("Iterator Method+++++++++++++++++++++++++");
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
				System.out.println(it.next());
		}
		

	}

}
