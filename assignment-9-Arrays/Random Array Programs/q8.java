import java.util.*;

public class q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] a = new int[len];

        for(int i=0; i<len; i++){
            a[i] = sc.nextInt(); 
        }

        for(int i=0; i<len-1; i++){
            for(int j=i+1; j<len; j++){
                System.out.println(a[i] + " " + a[j]);
            }
        }
    }
}