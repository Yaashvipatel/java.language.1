//6.table of a no.java
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no : ");
        int n = sc.nextInt();
        for(i=0;i<=10;i++){
            System.out.printf("\n%d * %d = %d",n,i,n*i);
        }
    }
}
