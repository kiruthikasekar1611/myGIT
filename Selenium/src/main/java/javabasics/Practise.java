package javabasics;

public class Practise {

	public static void main(String[] args) {
		
		String a="qweu12UJJKKHHjba999";
				
		int upper=0,lower=0,digit=0;
		
		for(int i=0;i<a.length();i++){
			
			char ch=a.charAt(i);
			
			if(Character.isDigit(ch)){ digit++; }
				
				if(Character.isLowerCase(ch)){ lower++;}
				
				if(Character.isUpperCase(ch)){ upper++;}
				
			
		}
		
		
		
		
		
		System.out.println("upper........."+ upper+"\nDigit......"+digit+ "\nLower ..."+lower);

	}

}
