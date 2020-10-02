package Day4;

public class Test
{//Data members
    private int i=10;//instance variable
   //Member function---1 
    void display()
    {
    System.out.println("Hi... "+i);//Hi... 10
    }
    //Member function---2
      int show()
    {
        int x=5,y=6,z;
        z=x+y;//11
    System.out.println("Hello...Sum=  "+z);//11
    return z;
    }
      //Main function
    public static void main(String args[])//function
    {
        //int i=10;//Local variable
       
        Test t1 = new Test();
         Test t2 = new Test();
        
        System.out.println(t1.i);//10
        t1.display();//Method 1--->to call a function
        
        //Method 2---> to call a function
       int m = t1.show();//z=11
       System.out.println(m);
       
       //Method 3 ---> tocall a function
       System.out.println("New output= "+t2.show());
       
    }
}
