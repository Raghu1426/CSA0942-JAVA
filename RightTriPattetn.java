import java.util.*;
public class RightTriPattern 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the no.of lines:");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 0; j <= n - i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
