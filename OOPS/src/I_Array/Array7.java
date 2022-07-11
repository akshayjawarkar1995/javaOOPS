package I_Array;

public class Array7 {
	
	//printing all data type in single array using object class
	//object class is use to print different type of data in one array
	
	public static void main(String[] args) {

		Object obj []=new Object[5];
		
		obj[0]=10;   // Integer
		obj[1]=20.5;  //double
		obj[2]="Welcome" ;// String
		obj[3]='A';   //char
		obj[4]=true;   // boolean
		
		System.out.println(obj.length);
        for(int i=0;i<obj.length;i++) {				
	    System.out.println(obj[i]);
}
	}

}
