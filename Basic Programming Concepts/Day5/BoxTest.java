
package Day5.box;

class BoxTest3
   {
       public static void main(String []args)
    {
        Box1 b1 = new Box1();//Runtime
        Box1 b2 = new Box1();//Runtime
        double vol;
        
        b1.depth=120;
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