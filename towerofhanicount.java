public class towerofhanicount {
    public static int toh(int n,char s,char h,char d){
        if(n==0){
            return 0;
        }
        return toh(n-1,s,d,h)+1+toh(n-1,h,d,s);
    }
    public static void main(String[] args) {
        System.out.println(toh(6, 's', 'h', 'd'));
    }
}
