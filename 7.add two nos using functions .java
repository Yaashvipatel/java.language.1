//7.add two nos using functions : 
import java.util.Scanner;
public class Main{
    public static int add(int a,int b){
        int sum=0;
        sum=a+b;
        return(sum);
    }
    public static void main(String[]args){
        System.out.println("enter a and b : ");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = add(a,b);
        System.out.println(res);
    }
}
