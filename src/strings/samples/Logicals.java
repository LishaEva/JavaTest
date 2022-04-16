package strings.samples;

import java.util.Scanner;

public class Logicals {

	public static void main(String[] args) {
		palindrome();
		AmstrongNumber();

	}

	public static void palindrome() {

		String input = "MOM";
		StringBuilder reveresedWord = new StringBuilder();
		char[] temp = input.toCharArray();

		for (int i = temp.length - 1; i >= 0; i--) {
			reveresedWord.append(temp[i]);
		}
		System.out.println(reveresedWord);
		// input is a string but reversed word is a string builder so they are not equal
		// use toString to convert it to String and then match
		if (input.equals(reveresedWord.toString())) {
			System.out.println("palindrome");
		}
	}

	public static void AmstrongNumber() {
		//int input = 153;
		//get teh input from runtime using a method
		int input = GetInputRunTime();
		// find the number of character/digits
		int count = 0, sum = 0, last = 0;
		int temp = input;
		while (temp != 0) {
			temp = temp / 10;
			count++;
		}

		System.out.println(input + "and temp is " + temp);
		temp = input;
		System.out.println(input + "and temp is " + temp);
		while (temp > 0) {
			last = temp % 10;
			System.out.println("temp is :" + temp + ".poer is" + Math.pow(last, count));
			sum += (int) Math.pow(last, count);
			System.out.println("sum" + sum);
			temp = temp / 10;
		}

		if (sum == input) {
			System.out.println("Given number" + input + " is an Amstrong Number");
		} else {
			System.out.println("Given number" + input + " is NOT an Amstrong Number");
		}
	}
	
	public static int GetInputRunTime() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input:");
		int input =in.nextInt();
		return input;
	}
}
