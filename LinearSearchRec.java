import java.util.Scanner;

public class LinearSearchRec {
    public static int linearSearch(int arr[],int idx,int key){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==key){
            return idx;
        }
        return linearSearch(arr, idx+1, key);
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
        System.out.print("Enter element to search:");
        int key=sc.nextInt();
        System.out.println(linearSearch(arr, 0, key));

    }
}
