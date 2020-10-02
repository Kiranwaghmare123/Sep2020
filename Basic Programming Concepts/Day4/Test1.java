package Day4;

public class Test1
{
    int i=10;
    
    void display()
    {
        System.out.println("Hi....");
    }
    
}
class TestDemo{
    public static void main(String args[])
    {
        Test1 t1 = new Test1();
        System.out.println(t1.i);
        t1.display();
        
    }
}