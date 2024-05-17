class superClass
{
    public void superFunction()
    {
        System.out.println("im superclassfunction");
    }

}
class subClass extends superClass
{
    public void subFuction()
    {
        System.out.println("im am subclassFunction");
    }

}
public class inheritance {
    public static void main(String[]args)
    {
        superClass parent=new superClass();
        subClass child=new subClass();
        parent.superFunction();
        child.subFuction();
        child.subFuction();//calling superclass method by child class obj..
    }
    
}
