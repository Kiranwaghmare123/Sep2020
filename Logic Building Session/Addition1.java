import java.util.Scanner;

class Addition1
{
public static void main(String args[])
{
int num1,num2;
int sum;

Scanner sc = new Scanner(System.in);

System.out.println("Enter int number1:");
num1 = sc.nextInt();
System.out.println("Enter int number2:");
num2 = sc.nextInt();

sc.close();

sum =num1+num2;
System.out.println("Sum = "+sum);
}
}

