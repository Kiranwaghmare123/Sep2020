package Day2;
import java.util.Scanner;
class Switch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any day:");
        byte day = sc.nextByte();
        switch(day)
        {
            case 1:
                    System.out.println("Monday");
                    break;
            case 2:
                    System.out.println("Tuesday");
                    break;
            case 3:
                    System.out.println("Wednesday");
            case 4:
                    System.out.println("Thursday");
            case 5:
                    System.out.println("Friday");
            case 6:
                    System.out.println("Saturday");
                    break;
            case 7:
                    System.out.println("Sunday");
            default:
                    System.out.println("Holiday !!!");
       
                
       
                      
        }
    }
}