public class finalKeyword {
    public final int x;
    {
        x=7;
    }
    public static final int y;
    static{
        y=7;
    }
    public void fun()
    {
     final int f=5;
     System.out.println(f);
    }
    public static void main(String[]args)
    {    finalKeyword f1=new finalKeyword();
      System.out.println(f1.x);
        System.out.println(y);
        
    }
    
}
