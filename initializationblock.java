public class initializationblock {
    private int x;
    {
        System.out.println("value of instance initialization block is " + x);
        x=5;// INSTANCE INITIALIZATION BLOCK...
    }
    public initializationblock()
    {
        System.out.println("value on constructor x is " + x);
    }
    public static int y;
    static
    {
        System.out.println("value of static initialization block is "+ y);
        y=6;//STATIC INITIALIZATION BLOCK...
    }
    public static void main(String[]args)
    {
             initializationblock i1=new initializationblock();
             System.out.println(initializationblock.y=6);
    }
    
}
