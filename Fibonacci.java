import java.util.*;
public class Fibonacci
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=input.nextInt();
        int a1=0,a2=1;
        for(int i=0;i<n;i++)
        {
             int a3=a1+a2;
             a1=a2;
             a2=a3;
        }
        System.out.print(a1+" ");
    }
}