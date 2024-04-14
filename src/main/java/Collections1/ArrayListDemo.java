package Collections1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		//ArrayList <Integer> al=new ArrayList<Integer>();
		//ArrayList <String> al=new ArrayList<String>();
		//List al =new ArrayList();
		al.add(100);
		al.add("Welcome");
		al.add(10.8);
		al.add('A');
		al.add(true);
		System.out.println(al);   //[100, Welcome, 10.8, A, true]
		System.out.println("The size of the ArrayList ="+al.size());    //5
		System.out.println("Adding new element are: "+al.add(3));     //Adding new element are: true
		System.out.println(al.get(3));   //A
		System.out.println(al);				//[100, Welcome, 10.8, A, true, 3]
		//System.out.println(al.set(4, 200));
		//System.out.println(al);
		System.out.println(al.contains(20));
		//System.out.println(al.remove(1));
		System.out.println(al);
		//System.out.println(al.removeAll(al));
		al.add(4,"Python");
		//Collections.sort(al);
		System.out.println(al);
		//isEmpty()
		System.out.println(al.isEmpty());
		//Extract  all the data from the ArrayList
		//1.For Loop
		System.out.println("Reading element using forloop");
		int i;
		for(i=0;i<al.size();i++)
		{
			
			System.out.print(al.get(i) + " ");
		}
		//2.For each Loop
		System.out.println("Reading element using foreach loop");
		for(Object e:al)
		{
			
			System.out.print(e + " ");
		}
		
		//3.Iterator();
		System.out.println("Reading element from the Iterator method");
		Iterator it=al.iterator();
		{
			
			while(it.hasNext())
			{
				System.out.print(it.next() + " ");
			}
		}
		
		

	}

}
