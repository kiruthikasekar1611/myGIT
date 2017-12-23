package javabasics;

public class Fibanocci {

	public static void main(String[] args) {
		
		int a=0,b=1,sum=0,count;
		System.out.print(a +","+b+ ",");
		for(int i=2;i<30;i++){
			sum=a+b;
			if(sum<100){
			System.out.print(sum +",");
			a=b;
			b=sum;
			}
		}
		
	}

}
