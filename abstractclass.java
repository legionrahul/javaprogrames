abstract class dummy
{
   abstract  public void fun();
}
class demo extends dummy
{
    public void fun()//method overloading
    {
        System.out.println("hello");
    }

}
public class abstractclass {
    public static void main(String[]args)
    {
        demo d1=new demo();
        d1.fun();
    }
}
