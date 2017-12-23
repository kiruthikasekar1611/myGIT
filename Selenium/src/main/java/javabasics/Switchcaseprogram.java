package javabasics;

import java.util.Scanner;

public class Switchcaseprogram {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the day -  ");
		String dayOfWeek = scan.next();
		
		switch(dayOfWeek)
		{
		case "sunday": System.out.println("1st day of the week");break;
		case "monday": System.out.println("2nd day of the week");break;
		case "tuesday": System.out.println("3rd day of the week");break;
		case "wednesday": System.out.println("4th day of the week");break;
		case "thursday": System.out.println("5th day of the week");break;
		case "friday": System.out.println("6th day of the week");break;
		case "saturday": System.out.println("7th day of the week");break;
		default : System.out.println("Enter a valid day");break;
		}
		scan.close();
	}

}
