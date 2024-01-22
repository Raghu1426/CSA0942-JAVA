import java.util.Scanner;
public class LcmGcd 
{
    static int gcd(int a, int b) 
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = input.nextInt();
        }
        int gcd = a[0];
        int lcm = a[0];
        for (int i = 1; i < n; i++) 
        {
            gcd = gcd(gcd, a[i]);
            lcm = (lcm * a[i]) / gcd(lcm, a[i]);
        }
        System.out.println("GCD is: " + gcd);
        System.out.println("LCM is: " + lcm);
        input.close();
    }
}
