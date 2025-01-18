import java.util.Arrays;
import java.util.Scanner;

public class S32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int[] res = new int[6];
        System.out.println("The first half reverse and returned elements");
        for(int i=0; i<a.length/2; i++){
            res[i] = a[i];
        }
        int j=a.length/2;
        for(int i=a.length-1; i>=a.length/2 && j<a.length; i--){
            res[j] = a[i];
            j++;
        }
        System.out.println(Arrays.toString(res));
    }
}
