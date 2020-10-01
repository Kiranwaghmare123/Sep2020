package Day3;
import java.util.Scanner;
class DoWhile1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();//5
        System.out.println("--------Start Print--------");
        
        do{
            System.out.println(n);//13
            n++;//67891011
            
        }while(n<11);
       
        System.out.println("Exit");
        
    }
    
}