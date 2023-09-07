package studio1;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in);
		Scanner n2 = new Scanner(System.in);
		
		
		System.out.println("The first of two integers to be averaged?");
		int num1 = n1.nextInt();
		System.out.println("The second of two integers to be averaged?");
		int num2 = n2.nextInt();
		System.out.println("The average of " +num1+" and "+num2 +" is "+(double)(num1+num2)/2);
	}
}	
