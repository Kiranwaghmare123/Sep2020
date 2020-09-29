package Day1;

class Hello
{
    void display()
    {
        int b=50;//b------>50
        System.out.println(b);//50
    }
    public static void main(String args[])
    {
    int b=10;//b---->10
    Hello h1 = new Hello();
    h1.display();
    System.out.println("Hello Mumbai...2 "+b);//b---->10
       
    
    }
}

