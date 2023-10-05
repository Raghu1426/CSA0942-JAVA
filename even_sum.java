import java.io.*;
import java.util.*;
class even_sum
{
	public static void main(String args[])
	{
		int i,n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter n value : ");
		n=s.nextInt();
		i=1;
		while(i<=n)
		{
			if(i%2==0)
				sum=sum+i;
			i++;
		}
		System.out.println("Sum of Even Number in "+n+" natural numbers is : "+sum);
	}
}