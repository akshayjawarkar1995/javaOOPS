package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
	
		LinkedList LL =new LinkedList();
		
		//Store only homogeneous data
		
		LL.add("A");
		LL.add("D");
		LL.add("C");
		LL.add("Z");
		LL.add("S");
		
		
		System.out.println(LL);
		//Addall
		
		LinkedList LLnew =new LinkedList();
		LLnew.addAll(LL);
		System.out.println(LLnew);
		
		//RemoveAll
		LLnew.removeAll(LL);
		System.out.println(LLnew);
				
		// Sort  - collections.sort()
		System.out.println("Before Sorting:"+LL);
		Collections.sort(LL);
		System.out.println("After Sorting :"+LL);
		
		//Reverse order
		Collections.sort(LL,Collections.reverseOrder());
   System.out.println(LL);
   
   // Shuffling
             Collections.shuffle(LL);
             System.out.println(LL);
	}
}
