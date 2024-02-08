package Day1;

import java.unil.Scanner;
public class Reverse {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ")
		int number = scanner.nextint();
		int reversedNumber=0, remainder;
		while (number !=0) {
			remainder = number %10;
			reversedNumber = reversedNumber * 10 + remainder;
			number /=10;
		}
		System.out.printIn("Reversed number: "+reversedNumber);
	}
}