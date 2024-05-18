class parent 
{
    parent()
    {
        System.out.println("im parent constructor");
    }
}
class child extends parent
{
    child()
    {   this(6);
        System.out.println("im child constructor");
    }
    child(int x)
    {
        System.out.println("im am 2nd child constructor");
    }

}
public class constructorchainig {
    public static void main(String[]args)
    {
        child c1=new child();
    }
    
}
