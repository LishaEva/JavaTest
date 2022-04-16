package basics.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyclassOfMethods {
	
	public  void listrelated() {
		String[] array = new String[] {"A","B","C"};
		List<String> list1 = Arrays.asList(array);
		List<String> list2 = new ArrayList<>(Arrays.asList(array));
		List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"),"c"));
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		System.out.println(list1.equals(list2));
		System.out.println(list1.equals(list3));
		System.out.println(list2.equals(list3));
		// the responses remain the same,[A, B, C] but they do not match true,false,false.
	}
	public void arrat() {
		
	}
	
}
