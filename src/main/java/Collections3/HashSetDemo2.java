package Collections3;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add(2);
		hs.add(4);
		hs.add(6);
		System.out.println(hs);
		HashSet <Integer> no=new HashSet<Integer>();
		no.addAll(hs);
		System.out.println(no);
		//remove all
		no.add(10);
		no.removeAll(hs);
		System.out.println(no);

	}

}
