package Day5;
class Test1
{
    int a;// default
    public int b;
    private int c;
    
    void setData(int x)//100
    {
        c=x;//c=100
    }
    
    int getData()
    {
        return c;
    }
    
}
class Access
{
   
    public static void main(String args[])
    {
        Test1 ob = new Test1();
        ob.a=10;
        ob.b=20;
        //ob.c=30;not correct--->Error
        
        ob.setData(100);
        
        System.out.println(ob.a);//defult variable
        System.out.println(ob.b);//public variable
        System.out.println(ob.getData());//private variable
        
    }
}