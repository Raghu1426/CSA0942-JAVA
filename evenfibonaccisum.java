import java.util.*;
public class evenfibonaccisum 
{
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        System.out.print("enter the number:");
        int n = input.nextInt();
        System.out.println("Even sum of Fibonacci series till number " + n + " is: " + fibEvenSum(n));
    }
    static int fibEvenSum(int n) 
    {
        if (n <= 0) 
        {
            return 0;
        }
        int fib[] = new int[2 * n + 1];
        fib[0] = 0;
        fib[1] = 1;
        int s = 0;
        for (int j = 2; j <= 2 * n; j++) 
        {
            fib[j] = fib[j - 1] + fib[j - 2];
            if (j % 2 == 0) 
            {
                s += fib[j];
            }
        }
        return s;
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         