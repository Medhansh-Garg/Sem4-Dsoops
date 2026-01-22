import java.util.Scanner;

public class spiralmatrix {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int mat[][]=new int[4][4];
    int top=0;
    int bottom=3;
    int left=0;
    int right=3;

    while(top<=bottom && left<=right){
        for(int i=left;i<=right;i++){
            mat[top][i]=sc.nextInt();
        }
        top++;
        for(int i=top;i<=bottom;i++){
            mat[i][right]=sc.nextInt();
        }
        right--;
        for(int i=right;i>=left;i--){
            mat[bottom][i]=sc.nextInt();
        }
        bottom--;
        for(int i=bottom;i>=top;i--){
            mat[i][left]=sc.nextInt();
        }
        left++;
    }
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
    int sum=0;
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            if(i==j){
                sum=sum+mat[i][j];
            }
        }
    }
}
}

