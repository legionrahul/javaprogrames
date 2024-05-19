interface demo
{
    int exampleVariable=8;//this variable is static and final
    
    public void fun();

}

interface demo2 extends demo{
    int exampleVariable=87;
    public void fun2();
}

class dummy implements demo2{
    
    public void fun()
    { 
        System.out.println("hello"+exampleVariable);
    }
    public void fun2()
    {
        System.out.println("heelo2");
    }

}
public class Interface {
    public static void main(String[]args)
    {
        dummy d1=new dummy();
        d1.fun();
        d1.fun2();
    }
    
}
