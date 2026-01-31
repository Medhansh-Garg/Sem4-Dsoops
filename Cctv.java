import java.util.Scanner;

public class Cctv {
    public static int cctvfind(int footage[],int idx,int key){
        if(idx==footage.length){
           return -1;
        }
        int answer=cctvfind(footage, idx+1, key);
        if(answer!=-1){
            return answer;
        }
        if(footage[idx]==key){
            return idx;
        }
        return -1;


  
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
        System.out.println(cctvfind(arr, 0, key));

    }
}
