package javabasics;

import java.util.Scanner;

public class PatternPrintOfNumbers {

	public static void main(String[] args) {

		System.out.println("Enter two numbers...");
		Scanner scan=new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		if(num1>num2){
			System.out.println("Please enter smaller number first");
		}
		else{


			for(int i =num1;i<=num2;i++){

				if(i%3 == 0 && i%5 ==0){
					System.out.print("FIZZBUZZ"+" ");
				}
				else if(i%3 == 0){
					System.out.print("FIZZ"+" ");
				}
				else if(i%5 == 0){
					System.out.print("BUZZ"+" ");
				}
				else {
					System.out.print(i+" ");
				}

			}
		}
		scan.close();
	}

}
