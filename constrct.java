public class constrct {
    private int a,b;
    public constrct()   //non parameterised constructor
    {
        System.out.println("constructor is started");
    }
    public constrct(int a,int b)   //parameterised constructor
    {
        this.a=a;
        this.b=b;
        System.out.println("a is "+a+"b is"+b);
        

    }
    public static void main(String[]args)
    {
        constrct c1=new constrct();
        constrct c2=new constrct(4,5);//constructor overloading
    }
}
