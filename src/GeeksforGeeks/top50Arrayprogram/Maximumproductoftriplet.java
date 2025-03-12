package GeeksforGeeks.top50Arrayprogram;
import java.util.Scanner;
import java.util.Arrays;

public class Maximumproductoftriplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int unique=1;
        int[] arr2 =new int[3];
        arr2[0]=arr[arr.length-1];
        if(arr.length>=3) {
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] != arr[i + 1]) {

                    arr2[unique] = arr[i];
                    unique++;
                }
                if (unique == 3) {
                    break;
                }
            }
            System.out.println(arr2[0]*arr2[1]*arr2[2]);
        }
        else
        {
            System.out.println("Array length is less than 3");
        }

    }
}
