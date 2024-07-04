//4.calculator using switch case.java
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter two nos , a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter 1 for addition , 2 for subtraction , 3 for multiplication , and 4 for division : ");
        int n = sc.nextInt();
        
        switch(n){
            case 1 : 
                    System.out.println(a+b);
                    break;
                    
            case 2 :
                    System.out.println(a-b);
                    break;
                    
            case 3 :
                    System.out.println(a*b);
                    break;
                    
            case 4 :
                    System.out.println(a/b);
                    break;
                    
            default : 
                    System.out.println("wrong button");
        }
    }
}
