package Day5;
class StringTest1 
{
    public static void main(String args[])
    {
        String s1 ="Hello ";
        String s2 = "New Delhi";
        String s3 = "Mumbai";
        String s4 = s1 + s2;
        System.out.println(s4);
        System.out.println(s4+ " and " +s3);
        System.out.println(s4.length());
        System.out.println(s4.charAt(6));
        
        if(s4.equals(s3))
            System.out.println("Equal String");
        else
            System.out.println("Not equal");
        
        
        
    }
}