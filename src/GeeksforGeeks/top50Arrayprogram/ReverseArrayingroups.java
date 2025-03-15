package GeeksforGeeks.top50Arrayprogram;
import java.util.Scanner;
import java.util.Arrays;


public class ReverseArrayingroups {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] arr2=new int[arr.length];
        int head=0;
        int temp=0;
        if(k>1)
        {
            for(int i=0;i<n;i++)
            {
                if(arr[i]%k==0)
                {
                    for(int j=i;j>=head;j--)
                    {
                        arr2[temp]=arr[j];
                        temp++;
                    }
                    head=i+1;
                }
            }
            if(head!=n-1)
            {
                for(int j=n-1;j>=head;j--)
                {
                    arr2[temp]=arr[j];
                    temp++;
                }
            }
            System.out.println(Arrays.toString(arr2));
        }
        else
        {
            System.out.println(Arrays.toString(arr));
        }
    }


}
