import java.util.*;
public class voting
{
    public static void main(String[]args)
    {
         Scanner input=new Scanner(System.in);
         System.out.print("Enter the age:");
         int age=input.nextInt();
         if(age>18)
         {
             System.out.print("you are eligible for vote");
         }
         else if(age<=0)
         {
             System.out.print("Enter the age correctly");
         }
         else
         {
             System.out.print("you are allowed to vote after" + (18-age) + "year");
        }
    }
}