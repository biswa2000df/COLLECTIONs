package Collections6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		//HashMap m=new HashMap();
		HashMap <Integer,String> m=new HashMap<Integer,String>();
		m.put(101,"kanha");
		m.put(102,"mama");
		m.put(103,"baba");
		m.put(104,"maa");
		m.put(105,"lulu");
		//m.put(101, "X");		//{101=X, 102=mama, 103=baba, 104=maa, 105=lulu}:-jadi duplicate value dela ta
		System.out.println(m);	//{101=kanha, 102=mama, 103=baba, 104=maa, 105=lulu}
		System.out.println(m.get(105));	//lulu
		m.remove(105);
		System.out.println(m);	//{101=X, 102=mama, 103=baba, 104=maa}
		System.out.println(m.containsKey(104));		//true
		System.out.println(m.containsValue(105));	//false
		
		
		System.out.println(m.containsValue("kanha"));	//true
		System.out.println(m.containsValue("lulu"));	//false
		
		System.out.println(m.isEmpty());//false      because the hashmap value is avaliable if it is not avaliable then there is no problem
		
		System.out.println(m.size());		//4
		/*m.clear();
		System.out.println(m);		//{}*/
		System.out.println(m.keySet());//return all the key element  [101, 102, 103, 104]
		
		for(Object i:m.keySet())
		{
			
			System.out.println(i);
		}
		System.out.println(m.values());	//return all the values 		[kanha, mama, baba, maa]
		
		for(Object i:m.values())
		{
			
			System.out.println(i);
		}
		
		System.out.println(m.entrySet());// It return all the sets [101=kanha, 102=mama, 103=baba, 104=maa]
		
		
		//Iterate all the key and value of the map
	/*	for(Object i:m.keySet())
		{
			
			System.out.println(i+"   "+m.get(i));
		}*/
		
		//Entry  method()
		/*for(Map.Entry entry:m.entrySet())
		{
			System.out.println(entry.getKey()+"      "+entry.getValue());	//	//both map and Entry() is display same
			
		}*/
		
		//Iterator()
		
		Set s=m.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			
			Entry entry=(Entry) it.next();
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}
		
		
		
	

	}

}
