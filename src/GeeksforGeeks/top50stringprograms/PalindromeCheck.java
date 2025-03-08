package GeeksforGeeks.top50stringprograms;
import java.util.Locale;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2=new String();
        for(int i=str.length()-1;i>=0;i--)
        {
            str2=str2+str.charAt(i);

        }
        if(str.equals(str2))
        {
            System.out.println("This is palindrome");
        }
        else
        {
            System.out.println("This is not palindrome");
        }

    }

}
