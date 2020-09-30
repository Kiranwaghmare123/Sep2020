package Day2;
class For2
{
    public static void main(String args[])
    {
        for(int i=1;i<5;i++)
        {
            System.out.println(i);//1,2,3,4
            if(i==3)
                continue;
            System.out.println(i);//1,2,4
        }
        
    }
}