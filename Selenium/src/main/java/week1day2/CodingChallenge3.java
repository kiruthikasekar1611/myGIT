package week1day2;

import java.util.Scanner;

public class CodingChallenge3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers ..");
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		int result=0;
		
		System.out.println("Enter the operation to be performed among these ... ADD/SUB/MUL/DIV");
		String option=input.next();
		
		switch(option){
		case "ADD": result=num1+num2;break;
		case "SUB": result=num1-num2;break;
		case "MUL": result=num1*num2;break;
		case "DIV": if(num2>num1){int temp=num1;num1=num2;num2=temp;}result=num1/num2;break;
		default: System.out.println("Enter the correct operation to be performed. Options are case sensitive ");break;
		}
		
		System.out.println("Result is - "+result);
		
		input.close();
	}

}
