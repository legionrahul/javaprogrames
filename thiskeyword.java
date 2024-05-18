class a
{ private int length,breadth,height;
    public void setdata(int length,int breadth,int height)
    {
        this.length=length;
      this. breadth=breadth;
       this. height=height;
    } 
    public void showdata()
    {
        System.out.println(length+" "+breadth+" "+" "+height);
    }

}
public class thiskeyword {
    public static void main(String[]args)
    {
        a obj=new a();
        obj.setdata(21,21,32);
        obj.showdata();
    }
    
}
