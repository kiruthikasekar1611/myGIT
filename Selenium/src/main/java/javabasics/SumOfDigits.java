package javabasics;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number whose sum of digits should be calculated");
		
		int inputNumber = scan.nextInt();
		
		int SumOfDigits =0;
		
		if (inputNumber <0){
			inputNumber = inputNumber * -1;
		}
		
		while (inputNumber > 0)

		{
		int quotient = inputNumber / 10;
		int remainder = inputNumber % 10;
		SumOfDigits = SumOfDigits + remainder;
		inputNumber = quotient;
		}
		
		System.out.println("The sum of digits of given input is :" + SumOfDigits);
		

	}

}
