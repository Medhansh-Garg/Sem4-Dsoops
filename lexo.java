import java.util.Scanner;

public class lexo {
    public static void lexnumb(int curr,int n){
        if(curr>n){
            return;
        }
        System.out.println(curr);
        for (int i = 0; i <=9; i++) {
            int next=curr*10+i;
            if(next>n)return;
            lexnumb(next, n);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter range:");
        int n=sc.nextInt();
        for (int i = 1; i <=9; i++) {
            lexnumb(i, n);
        }

    }
}
