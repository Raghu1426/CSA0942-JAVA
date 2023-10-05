import java.io.*;
import java.util.*;
class reverse
{
	public static void main(String args[])
	{
		int  n,rev=0,r;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter any Number:  ");
		n=s.nextInt();
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
			System.out.println("Reverse of the Number :   "+rev);
	}
}