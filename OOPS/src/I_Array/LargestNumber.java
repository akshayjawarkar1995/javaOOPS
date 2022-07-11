package I_Array;

public class LargestNumber {
	
public static void main(String[] args) {
		
		int arr[]  = {2,4,533,77,88,9,11};
		  // 2 = 2;
		
		int maximum = arr[0];
		 
		// 0<7  - True
		// 1<7   -True
		// 2<7   -True
		// 3<7   -True
		// 4<7   -True
		// 5<7   -True
		// 6<7   -True
		// 7<7   -False
		for(int i=0;i<arr.length;i++) {
			
			//    0>2      --False
			//    4>2      --True 
			//    533>4    --True
			//    77>533  --false
			//    88>533  --false
			//    9>533    --False
			//    11>533   --False
			if(arr[i]>maximum) {			         
				maximum = arr[i];   //4 533
			}			
		}
		System.out.println("Largest number present in given array is :"+maximum);
	}

}
