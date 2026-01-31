import java.util.Scanner;

public class reverserr {
    public static void reverserr(int arr[],int beg,int end){
        if(beg>end){
            return;
        }
        int temp=arr[beg];
        arr[beg]=arr[end];
        arr[end]=temp;

        reverserr(arr, beg+1, end-1);

    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.print("enter no of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements:-");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            
        }
        reverserr(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
