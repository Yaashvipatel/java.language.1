//3.print if can vote or not.java :
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println(" enter your age : ");
        int age ;
        Scanner sc=new Scanner (System.in);
        age = sc.nextInt();
        if(age>=18)
        System.out.println(" can vote ");
        else
        System.out.println(" can not vote ");
    }
}
