package Day3;

class Boolean
{
    public static void main(String args[])
    {
     long b1, b2;
  int i = 0, remainder = 0;
  int[] sum = new int[20];
  b1=101010;
  b2=111100;
  

  while (b1 != 0 || b2 != 0) 
  {
   sum[i++] = (int)((b1 % 10 + b2 % 10 + remainder) % 2);
   remainder = (int)((b1 % 10 + b2 % 10 + remainder) / 2);
   b1 = b1 / 10;
   b2 = b2 / 10;
  }
  if (remainder != 0) {
   sum[i++] = remainder;
  }
  --i;
  System.out.print("Sum of two binary numbers: ");
  while (i>=0)
  {
      System.out.print(sum[i]);
  
}

    }
}

/*ADD:
0+0=0
0+1=1
1+1=10/10===> Q=1-->carry
10+1=11/10===>Q=1--->carry
*/