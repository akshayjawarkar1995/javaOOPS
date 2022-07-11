package Collection;

import java.util.LinkedList;

public class LinkedList1 {
	
	public static void main(String[] args) {

		// Declare Linked List
	
          LinkedList LL =new LinkedList();	  // 
          
         // LinkedList<Integer>LL1=new LinkedList<Integer>();
       
		
		//Add elemenet into LL
		
		LL.add(100);
		LL.add("Welcome");
		LL.add(15.5);
		LL.add('A');
		LL.add(true);
		LL.add(false);
		
		System.out.println(LL);
		
		
		//2. Remove
		LL.remove(4);
		System.out.println("Afterremoving new lsit :"+LL);
		
		// Add element in the middle of LL
		LL.add(4, "Rohit");
		System.out.println("After inserting element :"+LL);
		
		//Get - Return the element at the specified position in this LL
		System.out.println(LL.get(4));
		
		//Set Method - Replace/update or modified the elemet at the specifed position 
		LL.set(4, "Virat");
		System.out.println("After changing the value :"+LL);
	}


}
