package I_Array;

public class TwoDimensional {
	
	public static void main(String[] args) {
		
		
		// Declaration 
		                       //Row Columns
		String s[][] =new String[3][5];  //2D array
		
		System.out.println(s.length);   //Size /legth /Total no of rows
		// if u want to get total no of columns
		
		System.out.println(s[0].length);    // columns size/leth -total no of columns
		
		//Initialization 
		 //Row& Columns
		
		//First Row
		s[0][0]="A";
		s[0][1]="B";
		s[0][2]="C";
		s[0][3]="D";
		s[0][4]="E";
		
		System.out.println(s[0][3]);
		
		//Second Row
	    s[1][0]="A1";
	    s[1][1]="A2";
	    s[1][2]="A3";
	    s[1][3]="A4";
	    s[1][4]="A5";
	    
	    System.out.println(s[1][2]);
			  
		// Third Row
	    
	    s[2][0]="B1";
	    s[2][1]="B2";
	    s[2][2]="B3";
	    s[2][3]="B4";
	    s[2][4]="B5";
	    
	    System.out.println(s[2][1]);
	    System.out.println(s[1][3]);
	    
	    //Print all the values of 2D array
	    
	    for(int row=0;row<s.length;row++) {   //Row
	    
	       for(int col=0;col<s[0].length;col++) {   // Columns
	    	   System.out.print(s[row][col]+" ");
	       }
	    
	    }
	}

}
