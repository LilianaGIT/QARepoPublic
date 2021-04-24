package javabasics.assignments;

import java.util.Scanner;

public class Assignments {

	public static void main(String[] args) {

		// 1
		int numA = 65;
		int numB = 35;

		System.out.println(numA + numB);

		// create a third variable and store the result and
		// print the result

		int result = numA + numB;

		System.out.println(result);

		// 2
		Scanner scan = new Scanner(System.in);

		int num = Integer.parseInt(scan.nextLine());

		boolean ifEven = (num % 2 == 0) ? true : false;

		System.out.println("Number " + num + " is even " + ifEven);

		// 3
		String random = "asdAasfascsadASXAXAdc";

		// loop around all the characters in the string

		System.out.println(random.toLowerCase());

		// 4 - 2 X PI X R

		float r = 7.5f;
		final float pi = 3.14f;

		System.out.println(2 * pi * r);

		// 5 - average of numbers

		int[] numArr = { 12, 34, 56, 78, 99 };

		int size = numArr.length;
		int sum = 0;

		for (int n : numArr) {
			sum = n + sum;
		}

		System.out.println("Average is " + (sum / size));

		// 6 - Swap variable

		int n1 = 20;
		int n2 = 30;

		n1 = n1 + n2; // 50

		n2 = n1 - n2; // 20

		n1 = n1 - n2; // 30

	}

}
