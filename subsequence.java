import java.util.Scanner;

public class subsequence {
    public static void subq(String s,String res){
        System.out.println("call s="+s+" ans="+res);
        if(s.length()==0){
            System.out.println(res);
            return;
        }
        char ch=s.charAt(0);
        String rem=s.substring(1);
        subq(rem,res+ch);
        subq(rem,res);

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the element:");
        String str=sc.nextLine();
        subq(str,"");

    }
}
