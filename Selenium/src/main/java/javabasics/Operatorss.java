package javabasics;

public class Operatorss {

	public static void main(String[] args) {

		int a=5;
		int b=3;
		boolean flag=true;

		if(!flag)
		{
			System.out.println("if !flag result is False ");
		}
		else
		{
			System.out.println("if !flag result is True ");
		}

		if( a ==5 && b++ == 3){
			System.out.println("a ==5 && b++ == 3 is true");
		}
		else
		{
			System.out.println("a ==5 && b++ == 3 is false");
		}

		if( a ==5 || ++b == 5){
			System.out.println("a ==5 || ++b == 5 is true");
		}
		else
		{
			System.out.println("a ==5 || ++b == 5 is false");
		}

		if( -b ==3 && a++ == 5){
			System.out.println("-b ==3 && a++ == 5 is true");
		}
		else
		{
			System.out.println("-b ==3 && a++ == 5 is false");
		}

		if( b--==4 && ++a == 7){
			System.out.println("b--==4 && ++a == 7 is true");
		}
		else
		{
			System.out.println("b--==4 && ++a == 7 is false");
		}

	}

}
