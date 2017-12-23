package javabasics;

public class Arraymatrix {

	public static void main(String[] args) {

		int [] a={1,5,8,6,9,12};

		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("\n\n");
		int b [][]={ { 1,2,3,4},
				{ 5,6,7,8},
				{ 8,5,6,4}
		};
		System.out.println("The Array in Matrix format ...\n");
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
