import java.util.Scanner;

public class permutation {
    static void perm(String str,String res){
        if(str.isEmpty()){
            System.out.println(res);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String rem=str.substring(0,i)+str.substring(i+1);
            perm(rem, res+ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter String:");
        String s=sc.next();
        perm(s, "");
    }

}
