package Collection;

import java.util.HashSet;

public class HashSet2 {
	
public static void main(String[] args) {
		
		HashSet<Integer> Hs=new HashSet<Integer>();
		
		Hs.add(2);
		Hs.add(4);
		Hs.add(6);
		
		System.out.println(Hs);
		HashSet<Integer> Hs1=new HashSet<Integer>();
		
		Hs1.addAll(Hs);
		System.out.println("New Hashset :"+Hs1);
		
		//Remove all
		Hs1.removeAll(Hs);
		System.out.println(Hs1);
		
	}

}
