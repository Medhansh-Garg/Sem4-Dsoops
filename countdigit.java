public class countdigit {
    public static int count(int n){
           if(n>=1 && n<10){
            return 1;
           }
           return 1+count((int)n/10);
    }
    public static void main(String[] args) {
        System.out.println(count(4567));
    }
}
