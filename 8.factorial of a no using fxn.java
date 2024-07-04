//8.factorial of a no using fxn.java : 
import java.util.Scanner;
public class Main{
    public static int fact(int n){
        int f=1;
        int i=0;
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        return(f);
    }
    public static void main(String[]args){
        System.out.println("enter n : ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int res = fact(n);
        System.out.println(res);
    }
}
