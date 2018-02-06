package java_Codes;

public class Stringreverse {

	public static void main(String[] args) {
		
		String s1="ele";
		int length=(s1.length())-1;
		String rev="";

		for(int i=length;i>=0;i--){
			rev=rev+s1.charAt(i);
		}
		
		System.out.println(rev);
		
		if(s1.equalsIgnoreCase(rev)){
			System.out.println("It is a palindrome");
		}
		else{
			System.out.println("It is not a palindrome");
		}

	}

}
