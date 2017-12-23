package javabasics;

import java.util.Scanner;

public class Strrev {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ...");
		String s1=sc.next();
		String rev="";
		char c[]=s1.toCharArray();
		int i,j=0;
		j=c.length-1;

		for(i=j;i>=0;i--){
			rev=rev+c[i];
		}

		System.out.println("original String -"+s1);
		System.out.println("Reverse String -"+rev);
		
		if(s1.equalsIgnoreCase(rev)){
			System.out.println("String is a palindrome");
		}
		else {
			System.out.println("Its not a palindrome");
		}
		sc.close();

	}
}