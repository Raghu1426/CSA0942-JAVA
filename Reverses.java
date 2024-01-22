import java.util.*;
class Reverses
{ 
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a word:");
  String word=sc.nextLine();
  String reverse = " ";
  for(int i= word.length()-1;i>=0;i--) 
	{
		reverse = reverse+word.charAt(i);
	}
  System.out.println("Reversed Word:" + reverse);
  sc.close();
  }
}