package javabasics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("Enter the number for which factotial has to be calculated ...");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int i=1,fact=1;
		for(i=1;i<=number;i++){
			fact=fact*i;
		}
		System.out.println("The factorial of given number "+number+" is "+fact);
		
		scan.close();
		
		

	}

}
