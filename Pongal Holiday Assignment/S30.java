import java.util.*;

public class S30{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int in = 0;
        int[] rev = new int[5];
        for(int i=arr.length-1; i>=0 && in<arr.length; i--){
            rev[in] = arr[i];
            in++;
        }
        System.out.println(Arrays.toString(rev));
    }
}