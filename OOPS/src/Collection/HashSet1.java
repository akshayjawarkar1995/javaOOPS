package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	
public static void main(String[] args) {
		
		HashSet Hs =new HashSet();  
		// Deafult capacity = 16 and load factor =0.75
		
		//HashSet Hs1 =new HashSet(100,(float) 0.90);  
		
		//HashSet<Integer> Hs1=new HashSet<Integer>();

		Hs.add(100);
		Hs.add("Welcome");
		Hs.add(15.5);
	//	Hs.add('A');
		Hs.add(true);
		Hs.add(false);
		Hs.add(20);
		Hs.add("Java");
		Hs.add(null);
		
	    System.out.println(Hs.add('A'));
	  //if we trying to add duplicate element then it will give false
		System.out.println(Hs);
		
		//Remove
		Hs.remove("Java");
		System.out.println(Hs);
		
	  
		//We don't have set method in hashset
		
		//Contains
		System.out.println(Hs.contains("Welcome"));
		System.out.println(Hs.contains("Welcoe"));
				
		//isempty
		System.out.println(Hs.isEmpty());
		
		//Reading element /obje from hashset
		System.out.println();
		
		for(Object obj:Hs) {
			System.out.println(obj);
				
			}
		
		//Iterator
		Iterator it =Hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		}

}
