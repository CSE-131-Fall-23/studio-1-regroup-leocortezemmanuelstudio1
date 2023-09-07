package studio1;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		System.out.println("What is the year?");
		Scanner n1 = new Scanner(System.in);
		int num1 = n1.nextInt();
		System.out.println(num1 + " is a leap year: " + (num1 % 4 == 0 && (num1 % 100 != 0 || num1 % 400 == 0)));
	}

}