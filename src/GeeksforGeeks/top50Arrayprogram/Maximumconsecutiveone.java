package GeeksforGeeks.top50Arrayprogram;
import java.util.Scanner;

public class Maximumconsecutiveone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int maxocc=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==1)
            {
             count++;
            }
            else if(arr[i]==0)
            {
                if(maxocc<count) {
                    maxocc = count;
                }
                count=0;
            }
        }
        if (maxocc < count) {
            maxocc = count;
        }
        System.out.println(maxocc);

    }
}
