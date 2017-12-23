package strings;

public class MostRepeatingCharacter {

	public static void main(String[] args) {
		
		String S1="hexawaraaea";
		
		int  count   = 1;
		int  max     = 1;
		char maxChar = S1.charAt(1);

		for(int i = 1; i < S1.length(); i++) {
		    count = (S1.charAt(i) == S1.charAt(i - 1)) ? (count + 1) : 1;
		    if (count > max) {
		        max = count;
		        maxChar = S1.charAt(i);
		    }
		}

		System.out.println("Longest run: "+max+", for the character "+maxChar); 

	}

}
