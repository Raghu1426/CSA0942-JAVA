import java.util.*;
public class printnumbyskip
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the starting number:");
        int m=input.nextInt();
        System.out.print("enter the ending number:");
        int n=input.nextInt();
        System.out.print("enter the no.of number to be skipped:");
        int k=input.nextInt();
        if(m==0||n==0||k==0)
        {
            System.out.print("invalid input...!!!");
        }
        else if(m<=n||k>=n||n<=m)
        {
            System.out.print("invalid input...!!!");
        }
        for(int i=m;i<=n;i=i+k+1)
        {
            System.out.print(i+" ");
        }
    }
}
