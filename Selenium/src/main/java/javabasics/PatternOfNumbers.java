package javabasics;

public class PatternOfNumbers {

	public static void main(String[] args) {
		
		int num=1;
		int n=4;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(num+" ");
				num=num+1;
			}
			System.out.println();
		}
	}

}
