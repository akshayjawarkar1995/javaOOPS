package I_Array;

public class Twodimensionalarray {
	
	public static void main(String[] args) {
		
		
		//for 2D array we have to put double square bracket ([][])
		//and the initialize the row and column value as given below
		int numbers[][]= {{1,3,4},{2,4,6}};   //2*3
	
		
		System.out.println(numbers.length); //to check row length
		System.out.println(numbers[0].length); //to check column length
		
		for(int i=0;i<numbers.length;i++) {
			
			for(int j=0;j<numbers[0].length;j++) {
				System.out.print(numbers[i][j]);
			}
		}	
	}

}
