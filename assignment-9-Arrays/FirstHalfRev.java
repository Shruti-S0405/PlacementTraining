import java.util.Arrays;
import java.util.Scanner;

public class FirstHalfRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int[] res = new int[6];
        System.out.println("The first half reverse and returned elements");
        int j=0;
        for(int i=a.length/2-1; i>=0 && j<a.length/2; i--){
            res[j] = a[i];
            j++;
        }
        for(int i=a.length/2; i<a.length; i++){
            res[i] = a[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
