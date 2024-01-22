import java.util.*;
class username
{
    public static void main(String[] args)
    {
        String str1,str2;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter username:");
        str1=in.nextLine();
        System.out.println("re-enter username:");
        str2=in.nextLine();
        if (str1.equals(str2))
            {
		System.out.println("username is valid");
	    }
        else
            {
            	System.out.println("invalid username");
            }
     }
}