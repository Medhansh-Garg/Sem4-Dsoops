import java.util.Scanner;

public class removechar {
    public static String remove(String str,char ch){
        if(str.length()==0){
          return "";
        }
        char first=str.charAt(0);
        String rem=remove(str.substring(1),ch);
        if(first==ch){
            return rem;
        }
        else{
            return first+rem;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.nextLine();
        System.out.println("Enter the character you want to remove:");
        char ch=sc.next().charAt(0);
        System.out.println(remove(str, ch));


    }
}
