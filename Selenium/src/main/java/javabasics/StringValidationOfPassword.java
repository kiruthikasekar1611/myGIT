package javabasics;

public class StringValidationOfPassword {
	
    public static boolean Validation(String str){
        
        char ch;
        int uppercase = 0,lowercase=0, number=0;
       
        for(int i=0;i<str.length();i++){
              
               ch= str.charAt(i);
               int asciivalue=(int) ch;
              
               if(asciivalue>=65 && asciivalue<=90){
                     uppercase++;
               }
              
               if(asciivalue>=97 && asciivalue<=122){
                     lowercase++;
               }
              
               if(Character.isDigit(ch)){
                     number++;
               }
                    
              
        }
       
        System.out.println("Upper case character count is "+uppercase);
        System.out.println("Lower case character count is "+lowercase);
        System.out.println("Digit count is "+number);
       
        if(str.length()>=10){
               if(uppercase>=1 && lowercase >=2 && number>=2 ){
                     return true;
               }
        }
       
        return false;
 }

 public static void main(String[] args) {

        String Password="Ap90PL4343HGDase";
       
        if(Validation(Password)){
               System.out.println("You have entered a valid password");
        }
        else{
               System.out.println("You have entered a invalid password");
        }



 }
}
	
