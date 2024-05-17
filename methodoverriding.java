class parent
{
    public void parenfun()
    {
        System.out.println("Im parent function");
    }
}
class  child extends parent
{
    public void fun()
    {
        System.out.println("im child fun");
    }
}
public class methodoverriding {
    public static void main(String[]args)
    {
        child childObj=new child();
        childObj.fun();         //  METHODOVERRIDING......

    }
    
}
