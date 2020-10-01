package Day3;
import java.util.Scanner;
class Array2
{
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        int a1[] = new int[5];
        //Array Input from user
         System.out.println("Enter Integer value;");
        for(int i=0;i<5;i++){
           a1[i]=sc.nextInt();//a[0],a[1],a[2],a[3],a[4],
        }
          System.out.println("Display array;");
        //To print Array values
        for(int x:a1)
        {
            System.out.println(x);
        }
            
    }
    
}
