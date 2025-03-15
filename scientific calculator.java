//scientific calculator 

import java.util.Scanner ;

class factorial
{
    void add(int a , int b)
    {
        System.out.println("addition is : "+ (a+b));
    }
    
    void sub(int a , int b)
    {
        System.out.println("difference is : "+ (a-b));
    }
    
    void pow(int a , int b)
    {
        System.out.println("result is : "+ Math.pow(a,b));
    }
    
    void mul(int a , int b)
    {
        System.out.println("multiplication is : "+ (a*b));
    }
    
    void div(int a , int b)
    {
        System.out.println("division is : "+ (a/b));
    }
    
    void rem(int a , int b)
    {
        System.out.println("remainder is : "+ (a%b));
    }
    
}

public class Main
{
	public static void main(String[] args) {
		factorial obj = new factorial();
		Scanner sc = new Scanner(System.in);
		System.out.println("1 to add , 2 for difference , 3 for power , 4 for multiply , 5 to divide , and 6 to find remainder ");

		do{
		    System.out.println("enter choice : ");
		    int choice = sc.nextInt();
		    System.out.println("enter the two nos : ");
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    switch(choice)
		    {
		        case 1 : 
		            obj.add(x,y);
		            break;
		        
		        case 2 : 
		            obj.sub(x,y);
		             break;
		            
		        case 3 :
		            obj.pow(x,y);
		             break;
		            
		        case 4 :
		            obj.mul(x,y);
		             break;
		            
		        case 5 :
		            obj.div(x,y);
		             break;
		             
		         case 6 :
		             obj.rem(x,y);
		              break;
		            
		        default :
		            System.exit(0);
		    }
		}while(true);
	}
}
