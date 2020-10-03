package Day5;
class Box
{
    double depth;
    double height;
    double width;
}
   class BoxTest2
   {
       public static void main(String []args)
    {
        Box b1 = new Box();//Runtime
        Box b2 = new Box();//Runtime
        double vol;
        
        b1.depth=10;
        b1.height=20;
        b1.width=30;
        vol=b1.depth*b1.height*b1.width;
        System.out.println("Volume= "+vol);
        
        b2.depth=10.3;
        b2.height=20.5;
        b2.width=30.7;
        vol=b2.depth*b2.height*b2.width;
        System.out.println("Volume= "+vol);
        
        
    }


}