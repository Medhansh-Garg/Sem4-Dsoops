public class nnumbers {
    public static  void number(int n){
          if(n==1){
            System.out.println(1);
            return;
          }
          number(n-1);
          System.out.println(n);
    }
    public static void main(String[] args) {
        number(10);
    }
}
