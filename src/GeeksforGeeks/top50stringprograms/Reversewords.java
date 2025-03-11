package GeeksforGeeks.top50stringprograms;
import java.util.Scanner;

public class Reversewords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String sub[]=str.split("\\.");
        String str2=new String();
        str2=sub[sub.length-1];
        for(int i=sub.length-2;i>=0;i--)
        {
           // System.out.println(sub[i]);
            str2=str2+"."+sub[i];
           // System.out.println(new String(str2));
        }
        System.out.println(new String(str2));

    }
}
