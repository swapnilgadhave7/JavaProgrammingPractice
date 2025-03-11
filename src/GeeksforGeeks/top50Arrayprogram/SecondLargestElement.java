package GeeksforGeeks.top50Arrayprogram;
import java.util.Arrays;
import java.util.Scanner;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int largest=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]!=largest)
            {
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("No largest Number present");
    }
}
