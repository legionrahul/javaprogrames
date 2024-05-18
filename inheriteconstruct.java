class parent 
{
    parent(int x)
    {
        System.out.println("im parent consrtructor");
    }
}
class child extends parent
{
    child()
    {  super(3);
        System.out.println("Im child constructor");
    }

}
public class inheriteconstruct {
    public static void main(String[]args)
    {
        child c1=new child();

    }
    
}
