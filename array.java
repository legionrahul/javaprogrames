import java.util.*;
public class array {
    public static void main(String[]args){

    System.out.println("enter the size of aaray");
    {  Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element of aaray"); 
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        for(int i=0;i<n;i++)
        
            System.out.println(arr[i]);
        
        
    }
    
}
}