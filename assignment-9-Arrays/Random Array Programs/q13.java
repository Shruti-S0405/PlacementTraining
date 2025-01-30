
import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[][] a = new int[len][len];
        int max = Integer.MIN_VALUE;

        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                a[i][j] = sc.nextInt();

            }
        }

        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(a[i][j] > max) max = a[i][j];
            }
        }        

        System.out.println(max);
    }
}
