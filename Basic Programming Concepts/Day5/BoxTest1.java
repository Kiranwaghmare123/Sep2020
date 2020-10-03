package Day5;
class BoxTest1
{
    double depth=10;
    double height=20;
    double width=30;
    
    public static void main(String []args)
    {
        BoxTest1 b1 = new BoxTest1();//Runtime
        double vol;
        /*
        b1.depth=10;
        b1.height=20;
        b1.width=30;
        */
        vol=b1.depth*b1.height*b1.width;
        System.out.println("Volume= "+vol);
        
        
    }


}