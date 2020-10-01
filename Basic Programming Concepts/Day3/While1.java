package Day3;
import java.util.Scanner;
class While1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();//10
        System.out.println("--------Start Print--------");
        
        while(n>=10)
        {
            System.out.println(n);//10
            n--;//9
       
        }
        System.out.println("Exit");
        
    }
    
}