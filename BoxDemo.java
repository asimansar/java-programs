

class Box
{
    double width;
    double height;
    double depth;
    
    Box(double wid, double hei, double dep)
    {
        System.out.println("Constructing Box");
        width = wid;
        height = hei;
        depth = dep;
    }
    
    double volume()
    {
        return width * height * depth;
    }
}

class BoxDemo
{
    public static void main(String args[])
    {
        
        /* declare, allocate, and initialize Box objects */
        Box mybox1 = new Box(100, 200, 150);
        Box mybox2 = new Box(30, 60, 90);
        
        double vol;
        
        /* get the volume of the first box */
        vol = mybox1.volume();
        
        /* print the volume of the first box */
        System.out.println("Volume of the first box is " + vol);
        
        /* get the volume of the second box */
        vol = mybox2.volume();
        
        /* print the volume of the second box */
        System.out.println("Volume of the second box is " + vol);
        
    }
}