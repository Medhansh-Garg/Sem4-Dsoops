public class powerofeachno {
    public static int power(int n,int x){
        
            if (x == 0) {
                return 1;
            }
            
            else {
                return n * power(n,x - 1);
            }
        }
    public static void main(String[] args) {
        System.out.println(power(3, 4));
    }
    }

