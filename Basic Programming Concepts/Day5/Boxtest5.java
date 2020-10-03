package Day5.box.pr3;
//import--> lang,util,.net...
class Box2
{
    double depth;
    double height;
    double width;
    
    void volume(double d,double h,double w)
    {
        depth=d;
        height=h;
        width=w;
        
        double v=depth*height*width;
        System.out.println("Volume= "+v);
    }
}
   class Boxtest4
   {
       public static void main(String []args)
    {
        Box2 b1 = new Box2();//Runtime
        Box2 b2 = new Box2();//Runtime
      
        b1.volume(10,10,10);//-->call
        b2.volume(20,40,56.34);
              
    }


}