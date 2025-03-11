package GeeksforGeeks.top50Arrayprogram;
import java.util.*;

public class Thirdlargestelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Set<Integer> unique = new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            unique.add(sc.nextInt());

        }
        int arr[]=new int[unique.size()];
        int i=0;
        for(int a:unique)
        {
            arr[i]=a;
            i++;
        }
        Arrays.sort(arr);
        if(arr.length>=3)
        {
            System.out.println("Third largest Number"+arr[arr.length-3]);
        }
        else
        {
            System.out.println("No 3rd largest number found");
        }

        // code by chat gpt
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        // Edge case: Array should have at least 3 elements
//        if (n < 3) {
//            System.out.println("No 3rd largest number found");
//            return;
//        }
//
//        int arr[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        Arrays.sort(arr);  // Sort in ascending order
//
//        // Track distinct elements starting from the end
//        int distinctCount = 1;  // Largest element is already counted
//        for (int i = arr.length - 2; i >= 0; i--) {
//            if (arr[i] != arr[i + 1]) {
//                distinctCount++;
//            }
//            if (distinctCount == 3) {
//                System.out.println("3rd Largest Element: " + arr[i]);
//                return;
//            }
//        }
//
//        System.out.println("No 3rd largest number found");

    }
}
