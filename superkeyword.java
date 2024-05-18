class parent
{
    public void fun()

{   
    System.out.println("im parent function");

}
}
class child extends parent
{
    public void fun()
    {
    System.out.println("im child function");
super.fun();
    }
  

}
public class superkeyword {
    public static void main(String[]args)
    {
        child c1=new child();
        c1.fun();
      
    }
    
}
