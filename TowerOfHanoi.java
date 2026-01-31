public class TowerOfHanoi {
    public static void toh(int n,char s,char h,char d){
        if(n==0){
            return;
        }
        toh(n-1,s,d,h);
        System.out.println("Move disK "+n+" From " +s+" to "+d);
        toh(n-1, h, s, d);


    }
    public static void main(String[] args) {
        toh(3, 's', 'h', 'd');

    }
}
