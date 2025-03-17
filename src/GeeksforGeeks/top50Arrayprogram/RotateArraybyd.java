package GeeksforGeeks.top50Arrayprogram;
import java.util.Scanner;
import java.util.Arrays;

public class RotateArraybyd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[] arr=new int[n];
        int i=0;
        for(int k=0;k<n;k++)
        {
            arr[k]=sc.nextInt();
        }

        while(i<d)
        {
            int temp = arr[0];

            for(int j=0;j<n-1;j++) {

                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;

            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
