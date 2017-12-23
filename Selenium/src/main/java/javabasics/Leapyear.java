package javabasics;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the year ...");
		int year=scan.nextInt();
		int length = String.valueOf(year).length();
		Boolean leap=false;

		if(length==4)
			if(year%4==0)
				if(year%100==0)
					
					if(year%400==0) leap=true;	else leap=false;
							
				else leap=true;
			else leap =false;		
		else System.out.println("Enter a valid year ");
			
		
		if(leap) System.out.println("The year "+year+"  is a leap year");	
	
		else System.out.println("The year "+year+"  is not a leap year");	
		
		scan.close();

	}

}
