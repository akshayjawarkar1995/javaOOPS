package I_Array;

public class Array5 {
	
	//String type array printing
	
	public static void main(String[] args) {

		// String array
		String s[]  =new String[4];
		
		s[0]="Dhoni";
		s[1]="Rohit";
		s[2]="Virat";
		s[3]="Rahul";
		
		System.out.println(s.length);
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
