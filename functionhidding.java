class parent 
{  static int y  =8;
    public static void fun()
    {
        System.out.println("Im parent static function");
    }
}
class child extends parent
{
     static 
    {
        y=6;
    }
    public static void fun()//function hidding 
    {
        System.out.println("Im child ststic function");
    }
}
public class functionhidding {
    public static void main(String[]args)
    {
        child c1= new child();
        c1.fun();
        System.out.println(child.y);
    }
    
}
