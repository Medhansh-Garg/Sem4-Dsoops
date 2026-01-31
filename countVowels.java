import java.util.Scanner;

public class countVowels {
    public static int countv(String s){
         if(s.length()==0){
            return 0;
         }
         char first=s.charAt(0);
         int ans=countv(s.substring(1));
         if("AIEOUaieou".contains(first+"")){
            return ans+1;

         }
         else{
            return ans;
         }
         

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String:");
        String s=sc.nextLine();
        System.out.println(countv(s));


    }
}
