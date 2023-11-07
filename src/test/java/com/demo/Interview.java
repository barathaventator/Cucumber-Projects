package com.demo;


public class Interview {
	
	public static void main(String[] args) {
		
		System.out.println("Code in Perf Branch");
		for (int i = 0; i < 5; i++) {
		
			System.out.println("*");
		}
		
	}

	public static void main(String[] args) {

		System.out.println("Code in the master");
		int num = 12345;
		int rev = 0;

		while (num > 0) {

			int a = num % 10;
			rev = (rev * 10) + a;
			num = num / 10;

		}

		System.out.println(rev);
	}

}
