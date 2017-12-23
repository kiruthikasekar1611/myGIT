package javabasics;

import java.util.Scanner;

public class LargestNumberWithoutDigits {

	public static void main(String[] args) {
		
		System.out.println("Enter a number and a single digit ...");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int digit=sc.nextInt();
		
		char charDigit=Integer.toString(digit).charAt(0);
		
		for(int i=number-1;i>0;--i){
			if(Integer.toString(i).indexOf(charDigit) == -1){
				System.out.println(i);break;
			}
		}
		sc.close();
	}

}
