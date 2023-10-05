import java.io.*;
import java.util.*;
class simple
{
	public static void main(String args[])
	{
		int p,t;
		float r,si;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Principle Amount: ");
		p=s.nextInt();
		System.out.println("Enter time period (in years) : ");
		t=s.nextInt();
		System.out.println("Enter Rate of Interest : ");
		r=s.nextInt();
		si=(p*t*r)/100;
		System.out.println("Simple Interest = "+si);
	}
}