package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {

	public static void main(String[] args) {
	
		String arr []= {"Dog","Elephant","Cat"};
		
//		for(String value:arr) {
//			System.out.println(value);			
//		}
		//Convert array into arraylist
		ArrayList  Al =new ArrayList(Arrays.asList(arr));
		System.out.println(Al);

	}
}
