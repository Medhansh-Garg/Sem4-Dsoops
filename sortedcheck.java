import java.util.Scanner;

public class sortedcheck {
    public static boolean  sortcheck(int arr[],int idx){
        if(idx==arr.length-1){
           return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }

        return sortcheck(arr, idx+1);
        


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
        System.out.println(sortcheck(arr,0));


    }
}
