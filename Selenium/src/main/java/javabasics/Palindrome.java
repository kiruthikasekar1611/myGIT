package javabasics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reversed .... ");
		int number=sc.nextInt();
		int originalNumber = number;
		int reverseNumber =0;
		while(number!=0){
			reverseNumber=(reverseNumber*10) + (number%10);
			number=number/10;
		}
		System.out.println("The Original number is - "+ originalNumber);
		System.out.println("The Reverse number is - "+ reverseNumber);
	}
}
