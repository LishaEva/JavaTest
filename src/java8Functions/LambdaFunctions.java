package java8Functions;

import java.util.ArrayList;

public class LambdaFunctions {

	public static void main(String[] args) {
		ArrayList<String> arrL = new ArrayList<String>();
		arrL.add("H");
		arrL.add("E");
		arrL.add("LL");
		arrL.add("O!");

		for(int i=0; i<arrL.size();i++) {
			System.out.println("The arrayElement:"+arrL.get(i));			
		}
		arrL.forEach(n -> System.out.println("The arrayElement in lambda:"+n));
	}

}
