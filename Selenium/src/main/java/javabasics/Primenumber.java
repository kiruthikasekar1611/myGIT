package javabasics;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int i=1,flag=0;
		while(i>0){
			System.out.println("Enter the number "+i +"- ");	
			int inputNumber=sc.nextInt();
			
			if(inputNumber == 0 || inputNumber == 1)
			{
				flag=1;
			}

			if(inputNumber==2)
			{
				flag=0;
			}
			
			if(inputNumber != 2)
			{
				int number=inputNumber/2;
				for(int j=2;j<=number;j++)
				{
					if(inputNumber%j==0){
						flag=1;					
					}
					else
					{
						flag=0;
					}
				}
				
			}
			
			if(flag==0)
			{
				System.out.println("The entered number "+ inputNumber +" is a prime number");
				System.out.println("The total numbers entered is .."+i);
				System.exit(1);
			}
			
			else
			{
				i++;
			}
			
		}
	}

}
