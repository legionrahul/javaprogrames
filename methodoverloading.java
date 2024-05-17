class parent
{
    public void parentFun()
    {
        System.out.println("hii im parent Function");
    }
}
class child extends parent
{
    public void childFun(int c)
    {
        System.out.println("im child function");
    }
}
public class methodoverloading {
    public static void main(String[]args)
    {
        child childObj=new child();
        childObj.parentFun();
        childObj.childFun(0);
    }
    
}
