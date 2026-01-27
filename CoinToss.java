import java.util.Scanner;

public class CoinToss {
    static void coinToss(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        coinToss(n-1,ans+'H');
        coinToss(n-1, ans+"T");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the coins:");
        int c=sc.nextInt();
        coinToss(c, "");
    }
}
