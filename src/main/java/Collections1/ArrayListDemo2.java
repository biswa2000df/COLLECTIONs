package Collections1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a new ArrayList
		ArrayList al=new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println(al);
		//create another arraylist to storea all the previous array in the new array
		ArrayList al_dup=new ArrayList();
		al_dup.addAll(al);
		System.out.println("After adding all element what the element present in the 1st array list "+al_dup);
		//Remove all the element form the 2nd array list
		al_dup.removeAll(al);
		System.out.println(al_dup);
		System.out.println("Element is present in the Arraylist:"+ al);
		Collections.sort(al);
		System.out.println("Element is present after shorted :"+al);
		//Reverse ArrayList
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Element is present after shorted  the reverse order :"+al);
		//Collections. Shuffle
		Collections.shuffle(al);
		System.out.println("Element is present after Shuffle :"+al);
		
		

	}

}
