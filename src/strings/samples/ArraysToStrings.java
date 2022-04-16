package strings.samples;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysToStrings {

	public static void main(String[] args) {
		String arr[] = { "Hello", "My", "name", "is", "Lisha" };

//		convertArrayToString(arr);
//		convertArrayToStringusingBuilder(arr);
//		substringConcepts();
//		reverse("Love is in the air");
		System.out.println(LOB("CCA","123"));
		System.out.println(LOB("CCA","ASO"));
		System.out.println(LOB("CCA","AAA"));
		System.out.println(LOB("252","AAA"));
		System.out.println(LOB("MLA","AAA"));
	}

	public static String convertArrayToString(String[] arr) {
		String sentence = Arrays.toString(arr);
		System.out.println(sentence);
		return sentence;
	}

	public static void convertArrayToStringusingBuilder(String[] arr) {

		StringBuilder sentence = new StringBuilder();
		sentence.append(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			sentence.append(" " + arr[i]);
		}
		System.out.println(sentence);
		// return sentence;
	}

	public static void substringConcepts() {
		String input = "bitcoin";
		String x = input.substring(0, 1) + input.substring(2, 4);
		System.out.println(x);// to get btc

	}

	public static String LOB( String accountType, String ProductId) {
		String[] MTG_B = { "BBB", "CCC", "AAA", "SSS", "LLL" };
		String[] MTG_C = { "111", "444", "222", "555", "888" };
		String[] CCA_B = { "APO", "ASO", "LPO" };
		String[] CCA_C = { "123", "525", "369" };
		
		if (accountType.equals("CCA")) {
			if (Arrays.asList(CCA_C).contains(ProductId) == true)
				return "Consumer";
			else if (Arrays.asList(CCA_B).contains(ProductId) == true)
				return "business";

		}
		if (accountType.equals("MTG")) {
			if (Arrays.asList(MTG_C).contains(ProductId) == true)
				return "Consumer";
			else if (Arrays.asList(MTG_B).contains(ProductId) == true)
				return "business";

		}
		if (accountType.equals("MLA")) {			
				return "Consumer";
		}
		
		return "no LOB";

	}

	public static String reverse(String input) {

		StringBuilder Reversecharacters = new StringBuilder();
		char[] characters = input.toCharArray();
		for (int i = characters.length - 1; i >= 0; i--) {
			Reversecharacters.append(characters[i]);

		}
		System.out.println(Reversecharacters);

		return Reversecharacters.toString();
	}

}
