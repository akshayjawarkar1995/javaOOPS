package I_Array;

import java.util.Arrays;

public class Array1 {
	
	//Print array using for loop
	
public static void main(String[] args) {
	    
		//int array
		
		int arr [] =new int [5];
		
		arr[0]=30;
		arr[1]=60;
		arr[2]=70;
		arr[3]=40;
		arr[4]=80;
		
		System.out.println(arr.length);
		
	     Arrays.sort(arr);
//	     
//	    System.out.print(arr);
//	    System.out.println();
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);

		System.out.println();
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
			
			
		}
		
//		        i=0;0<5;  -True
//		        i=1i<5     True
//		          2<5      True
//		          3<5      True
//		          4<5      True
//		          5<5      false
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");    //30  40 50 60 70
		}
	}


}
