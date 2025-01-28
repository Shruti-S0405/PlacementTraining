
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
        int index = 0;
        int resin = 0;
        for(int i=0; i<a.length; i++){
            if(i!=index && a[i]+a[index] == target){
                res[resin++] = i;
                res[resin] = index;
            }
        }
        System.out.println(Arrays.toString(res));
    } 
}
