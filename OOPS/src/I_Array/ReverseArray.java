package I_Array;

public class ReverseArray {
	
	//logical program to reverse array
	
	public static void main(String[] args) {
		
		int arr[]  = { 1,9,6,8,10};

		System.out.println("Orginal array");
	   //System.out.println(arr.length);
		          //  0<5
		          //  4<5
		          //  5<5   -- False
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Reverse array");
		              //  5-1  4>=0  -True
		              //         3>=-  -True
		              //       0>=0 -- Ture
		for(int j=4;j>=0;j--) {
			System.out.print(arr[j]+" ");
		}	
	}

}
