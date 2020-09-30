class TernaryOp
{
    public static void main(String []args)
    {
        int i=1268;
        
        String s1=(i%2==0)?i+" is even":i+" is odd";
        System.out.println(s1);
        System.out.println((i%2==0)?i+" is even":i+" is odd");
    }
}
