package GeeksforGeeks.top50Arrayprogram;
import java.util.Scanner;
import java.util.Arrays;

public class Movezerostoend {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0;

        for(int i=0;i<n;i++)
        {
             arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[count]=arr[i];
                count++;
            }
        }
        while(count<n)
        {
            arr[count]=0;
            count++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
