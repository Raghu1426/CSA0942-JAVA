import java.io.*;
import java.util.*;
class palindrome
{
	public static void main(String args[])
	{
		int  n,rev=0,r,x;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter any Number:  ");
		n=s.nextInt();
		x=n;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev==x)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");
	}
}