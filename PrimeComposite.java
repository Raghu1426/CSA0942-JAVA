import java.util.*;
class PrimeComposite
{
    public static void main(String args[])
    {
        int p=0,c=0;
        int n,num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.of inputs:");
        n=sc.nextInt();
        System.out.println("Enter the numbers:");
        for(int i=0;i<n;i++)
        {
            num=sc.nextInt();
            for(int j=2;j<num;j++)
            {
                if(num%j==0)
                {
                    c+=1;
                    break;
                }
                else
                {
                    p+=1;
                    break;
                }
            }

        }
        System.out.println("Composite numbers are:" + c);
        System.out.println("Prime numbers are:" + p);

    }
}