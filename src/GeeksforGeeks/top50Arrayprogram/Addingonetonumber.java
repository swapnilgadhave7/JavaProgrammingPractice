package GeeksforGeeks.top50Arrayprogram;
import java.util.Scanner;

public class Addingonetonumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];


        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //optimized code by chatgpt
        int result = 0;
        for(int i = 0; i < arr.length; i++)
        {
            result = result * 10 + arr[i];
        }
        result++;
        System.out.println("Result: " + result);
        //code written by me but not optimized
        //   double result=0;
        //double a=0;
//        for(int i=arr.length-1;i>=0;i--)
//        {
//
//            result=result+(arr[i]*Math.pow(10,a));
//           // System.out.println(result);
//            a++;
//        }
//        result=result+1;
//        int finalresult =(int)result;
//        System.out.println(finalresult);
    }
}
