class state
{
    private int length,breadth,height;
    public void setdimension(int x,int y,int z)
    {    length=x;
        breadth=y;
        height=z;

    }
    public void show()
    {
        System.out.println(length +" is length" + breadth +" is breadth"+ height+" is height");
    }
}
public class classAndObject {
    public static void main(String[]args)
    {
        state s1=new state();
        s1.setdimension(1,22,33);
        s1.show();
    }
    
}
