package Collections4;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lh=new LinkedHashSet();
		//LinkedHashSet <Integer>lh=new LinkedHashSet <Integer>();
		//HashSet lh=new HashSet();
		lh.add(100);
		lh.add(200);
		lh.add(300);
		lh.add(400);
		System.out.println(lh);//[100, 200, 300, 400]
		/*HashSet lh=new HashSet();
				lh.add(100);
				lh.add(200);
				lh.add(300);
				lh.add(400);
		System.out.println(lh);[400, 100, 200, 300]*/
		
		

	}

}
