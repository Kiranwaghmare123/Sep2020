package Day5;
class StringTest3
{
    public static void main(String args[])
    {
        char c[]={'J','A','V','A'};
        String s1 = "Java";
        String s2 = new String(c);//Java
        String s3 = new String(s2);//Java
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        
    }
}