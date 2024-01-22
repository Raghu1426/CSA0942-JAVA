import java.util.*;
public class factorial
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=input.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
             fact=fact*i;
        }
        System.out.print(n+" factorial = "+fact);
    }
}
