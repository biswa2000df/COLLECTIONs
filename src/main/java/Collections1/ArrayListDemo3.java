package Collections1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here convert array to arrayList
		String s[]= {"Dog","Cat","Rat"};
		/*for(String str:s)
		{
			System.out.println(str);
		}*/
		int length=s.length;
		int i;
		for(i=0;i<length;i++)
		{
			
			System.out.println(s[i]);
		}
		ArrayList ar=new ArrayList(Arrays.asList(s));
		System.out.println(ar);
	}

}
