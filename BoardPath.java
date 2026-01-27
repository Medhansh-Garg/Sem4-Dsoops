import java.util.Scanner;

public class BoardPath {
    static void validpaths(int curr,int end,String ans){
        if(curr==end){
            System.out.println(ans);
            return;

        }
        if(curr>end)return;
        for(int i=1;i<=6;i++){
            validpaths(curr+i, end, ans+i);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter end point:");
        int n=sc.nextInt();
        validpaths(0, n,"" );
    }
}
