package Day3;
import java.util.Scanner;
class Array5
{
    public static void main(String []args)
    {       
        int a[]={1,2,3};//--->1D-->Row/
        int b[]={1,12,23,67};
        int c[]={1,2,43};
        int a1[][]=new int[3][];//Multidimensional Array
        //[]->Row,[]->Col
        
        a1[0]=a;
        a1[1]=b;
        a1[2]=c;
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a1.length;j++)
            {
                System.out.print(a1[i][j]+" ");
            }
            System.out.println("");
        }
        
        
        
    
    }
}