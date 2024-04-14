package Collections2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		//LinkedList l <String>=new LinkedList <String>();
		//LinkedList l <Integer>=new LinkedList <Integer>();
		l.add(100);
		l.add("welcome");
		l.add(15.20);
		l.add(true);
		l.add(null);
		System.out.println(l);
		//size();
		System.out.println(l.size());
		//Retriving the element
		
		System.out.println("Retriving the element we get :"+l.get(3));
		//Removing the element
		l.remove(3);
		System.out.println("After removing the element are:"+l);//[100, welcome, 15.2, null]
		//Replace the 
		l.set(3, "X");
		System.out.println("After adding the element are:"+l);
		//Contains-Check the element is present in the list or not;
		
		System.out.println(l.contains("X"));
		
		System.out.println(l.isEmpty());
		//LOOP USING
		//FOR LOOP
		System.out.println("Using For Loop");
		int i;
		for(i=0;i<l.size();i++)
		{
			
			System.out.print(l.get(i)+" ");
		}
		//For Each  Loop
		System.out.println("Using For Each  Loop");
		for(Object o:l)
		{
			
			System.out.print(o+" ");
		}
		//Iterator()
		System.out.println("Using Iterator method");
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		
		
	}

}
