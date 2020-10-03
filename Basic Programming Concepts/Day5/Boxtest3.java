package Day5.pr1;
//import--> lang,util,.net...
class Box2
{
    double depth=10;
    double height=20;
    double width=30;
    
    void volume()
    {
        double v=depth*height*width;
        System.out.println("Volume= "+v);
    }
}
   class Boxtest3
   {
       public static void main(String []args)
    {
        Box2 b1 = new Box2();//Runtime
        Box2 b2 = new Box2();//Runtime
        
        b1.depth=120;
        b1.height=20;
        b1.width=30;
        
        b1.volume();//Execute-->call for function
            
        b2.volume();
        
        
        
    }


}