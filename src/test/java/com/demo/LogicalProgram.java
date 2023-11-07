package com.demo;


public class LogicalProgram {

	public static void reverseNumber() {

		int num = 12345;
		int rev = 0;

		while (num > 0) {

			int a = num % 10;
			rev = (rev * 10) + a;
			num = num / 10;

		}

		System.out.println(rev);

	}

	public static void reverseString() {

		String name = "Barath";
		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);

		}

		System.out.println(rev);

	}

	public static void reverseSentence() {

		String str = "Barath is a good Boy";
		String[] words = str.split(" ");
		String reversedString = "";

		for (int i = 0; i < words.length; i++) {

			String word = words[i];

			String reverseword = "";

			for (int j = word.length() - 1; j >= 0; j--) {

				reverseword = reverseword + word.charAt(j);
			}
			reversedString = reversedString + reverseword + " ";
		}
		System.out.println(reversedString);

	}

	public static void main(String[] args) {

		// reverseNumber();
		// reverseString();
		reverseSentence();
	}

}
