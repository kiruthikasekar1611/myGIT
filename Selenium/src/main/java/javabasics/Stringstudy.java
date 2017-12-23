package javabasics;

public class Stringstudy {

	public static void main(String[] args) {
		
		String s1= "New home";
		String s2= "New home";
		String s3= new String ("New home");
		String s4= new String ("new HOME");
		
		if(s1 == s2){ System.out.println("s1 == s2 : OK");} else {System.out.println("s1 == s2 : Not OK");}

		if(s1.equals(s2)){ System.out.println("s1.equals(s2) : OK");} else {System.out.println("s1.equals(s2) : Not OK");}
		
		if(s1 == s3){ System.out.println("s1 == s3 : OK");} else {System.out.println("s1 == s3 : Not OK");}

		if(s1.equals(s3)){ System.out.println("s1.equals(s3) : OK");} else {System.out.println("s1.equals(s3) : Not OK");}
	}

}
