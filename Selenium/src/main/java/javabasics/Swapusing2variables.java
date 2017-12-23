package javabasics;

import java.util.Scanner;

public class Swapusing2variables {

	public static void main(String[] args) {

		System.out.println("Enter two numbers to be swapped ...");
		Scanner scan=new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("Numbers before swap: "+num1+" "+num2);
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println("Numbers after swap: "+num1+ " "+num2);
	}

}
