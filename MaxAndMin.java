import java.util.Scanner;
import java.util.Arrays;
class MaxAndMin 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter the mth value:");
        int m=s.nextInt();
        System.out.print("Enter the nth value:");
        int n=s.nextInt();
        int mm=arr[size-m];
        int nn=arr[n-1];
        int sum=mm+nn;
        int diff =mm-nn;
        System.out.println("the mth max number is:"+mm);
        System.out.println("the nth min number is:"+nn);
        System.out.println("the sum is:"+sum);
        System.out.println("the difference is:"+diff);
    }
}