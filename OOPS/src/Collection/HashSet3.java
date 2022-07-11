package Collection;

import java.util.HashSet;

public class HashSet3 {
	
	public static void main(String[] args) {
	       HashSet<Integer> Hs=new HashSet<Integer>();
			
	        Hs.add(1);
			Hs.add(2);
			Hs.add(3);
			Hs.add(4);
			Hs.add(5);
			Hs.add(6);
			
			System.out.println("Hashset :"+Hs);
			
			HashSet<Integer> Hs1=new HashSet<Integer>();

			Hs1.add(4);
			Hs1.add(5);
			Hs1.add(7);
			System.out.println("Hashset :"+Hs1);
			
			//Union  - Only unique elemet will displyed
//			Hs.addAll(Hs1);
//			System.out.println("Union :"+Hs);
//			
//			//intersection - Only common element will be displayed
//			Hs.retainAll(Hs1);
//			System.out.println("Common:"+Hs);
			
			//Difference
//			Hs.removeAll(Hs1);
//			System.out.println(Hs);
			
			//Subset
			//System.out.println(Hs.containsAll(Hs1));
		}

}
