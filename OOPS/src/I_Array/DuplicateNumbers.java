package I_Array;

public class DuplicateNumbers {
	
	public static void main(String[] args) {
		
		int []  arr = {1,3,4,2,1,2,7,9,3,10};
		
		System.out.println("Duplicate element in given array");
		System.out.println(arr.length);
		         //   0<10
		for(int i=0;i<arr.length;i++) {   //1
			           //1<10
			//           4<10
			for(int j=i+1;j<arr.length;j++) {
				      //1==3
			          //1==4s
				      //1==1
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]+" ");
				}
			}
		}
	}

}
