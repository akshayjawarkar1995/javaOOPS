package Collection;

import java.util.PriorityQueue;

public class PriorityQueue1 {
	

		public static void main(String[] args) {
		
			// Insertion Order Preserved
			//Duplicate allowed
			//Homogeneous type of data

			PriorityQueue PQ =new PriorityQueue();  
			
			//Adding element 1. Add 2. offer()
			
			PQ.add("A");
			PQ.add("B");
			PQ.add("C");
			PQ.add("D");
			PQ.offer("Z");
			
			System.out.println(PQ);
			
		//	System.out.println(PQ.offer(100));
		//	System.out.println(PQ);
			
			//Get Head element  3. Element 4. peak
			
		//	System.out.println(PQ.element()); // If the queue is empty it will throw 
		//   nosuchelement exception
			
			
		//	System.out.println(PQ.peek());// If empty it will return NUll
			
			
		//6. Remove
	    //	System.out.println(PQ.remove());  //NoSuchElementException
	    //  System.out.println(PQ);
			
		//7. Poll
	    //	System.out.println(PQ.poll());
	    //	System.out.println(PQ);
			
			
			//for each loop
			System.out.println("Reaading element using for each loop");
			for(Object obj :PQ) {
				System.out.println(obj);
			}
		}

}
