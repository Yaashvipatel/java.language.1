//5.sum of n nos using do while.java
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter n : ");
        int sum=0;
        int i=0;
        int n = sc.nextInt();
        do{
            sum=sum+i;
            i++;
        }while(i<=n);
        System.out.println(sum);
    }
}
