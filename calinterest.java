 import java.util.*;
class calinterest
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("enter principal amount:");
        int pri=input.nextInt();
        System.out.print("enter the no.of years:");
        int year=input.nextInt();
        System.out.print("is the customer senior citizen(y/n):");
        char age=input.next().charAt(0);
        double interest=0.0;
        if(age=='y')
        {
             interest=(pri*year*0.12)/100;
             System.out.print(interest);
        }
        else
        {
             interest=(pri*year*0.1)/100;
             System.out.print("interest is:" + interest);
        }
    }
}