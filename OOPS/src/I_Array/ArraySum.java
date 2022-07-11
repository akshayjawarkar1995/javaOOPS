package I_Array;

public class ArraySum {
	
	public static void main(String[] args) {
		int []  arr = {1,3,4,2,1,2};
		
		int sum = 0;
		               //0<6  - True
		               //6<6  - True
		for(int i=0;i<arr.length;i++) {
			// 0 = 0 + 1
			// 4 = 1+3
			// 4= 4+4
			//11 =11+2
			sum = sum +arr[i];		
		}
		System.out.println("Sum of all the element of an array :"+sum);
	}

}
