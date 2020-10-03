package Day5;
class car
{
    double pr=100000;
    String s1;
    //Constructor---> default value 
  
    car()//default constructor
    {
        pr=500000;
    }
    car(double p)
    {
        pr=p;
     
    }
    car(double p,String name)
    {
        pr=p;
        s1=name;
    }
    
    void display()
    {
    System.out.println(pr);
     
    }
public static void main(String args[])
{
    //car c1 = new car(80,"BMW");
    car c3 = new car();
    car c2 = new car();
    
    c2.display();
   // c3.display();
    //c1.display();
}
}