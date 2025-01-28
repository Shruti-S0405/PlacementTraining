
import java.util.Arrays;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt(); 
        }
        int target = sc.nextInt();

        int[] res = new int[2];
        for(int i=0; i<a.length-1; i++){
            for(int j = i+1; j<a.length; j++){
                if(a[i] + a[j] == target)
                res[0] = i;
                res[1] = j;
            }
        }
        System.out.println(Arrays.toString(res));
    } 
}
