package Collections3;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> set1=new HashSet<Integer>();
		set1.add(2);
		set1.add(4);
		set1.add(6);
		set1.add(8);
		set1.add(10);
		System.out.println(set1);
		HashSet <Integer> set2=new HashSet<Integer>();
		set2.add(6);
		set2.add(8);
		set2.add(10);
		System.out.println(set2);
		//union
		set1.addAll(set2);
		System.out.println(set1);
		//Intersection
		//set1.retainAll(set2);
		//System.out.println(set1);
		//Defference
		//set1.removeAll(set2);
		//SSystem.out.println(set1);
		//Subset
		set1.containsAll(set2);
		System.out.println(set1);
		
	}

}
