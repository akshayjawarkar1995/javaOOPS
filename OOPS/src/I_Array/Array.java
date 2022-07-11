package I_Array;

import java.util.Arrays;

public class Array {
	
	//single dimensional array
	
	public static void main(String[] args) {
		
		//				int i=10;
		//		       	i=20;  
		//				int k=30;
		//				int j1=40;
				
				
				//Array Declaration
				int a[] =new int[10];
				
				// Array initialization
				a[0]=10;
				a[1]=20;
				a[2]=30;
				a[3]=40;
				a[4]=50;
				a[5]=60;
				a[6]=70;
				a[7]=80;
				a[8]=90;
				a[9]=100;

				
				// Array usages
				System.out.println(a[1]);
				System.out.println(a[2]);
				System.out.println(a[3]);
				System.out.println(a[4]);		
				
				
				//this is use to know array length
				System.out.println(a.length);
				System.out.println();
				
				
				//this is use to sort array
			    Arrays.sort(a);

				// Array usages
				System.out.println("array Sorting");
				System.out.println(a[1]);
				System.out.println(a[2]);
				System.out.println(a[3]);
				System.out.println(a[4]);
				System.out.println();
				
				System.out.println("using for loop");
				//for loop use to print array without initializing it one by on
				for(int i=0;i<a.length;i++) {
					System.out.println(a[i]);
			}
}
}

