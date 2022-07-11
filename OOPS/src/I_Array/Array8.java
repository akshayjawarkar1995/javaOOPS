package I_Array;

import java.util.Arrays;

public class Array8 {
	
	
	public static void main(String[] args) {
		  
		//Dec & ini
		
//	int arr [] =new int[5];    // array dec

//----------------------------------------------------//	
		
		//at a time Array declaration & initialization
		
		int arr1 [] = {10,35,60,50,40};  //Array declaration & initialization
		
		System.out.println(arr1.length);
		Arrays.sort(arr1);
	
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
				
	}

}
