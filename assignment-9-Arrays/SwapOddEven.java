import java.util.Arrays;
import java.util.Scanner;

public class SwapOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Before Swapping: "+Arrays.toString(a));
        for(int i=0; i<a.length; i++){
            if(i%2!=0 && i!=a.length-1){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }

        System.out.println("After Swapping: "+Arrays.toString(a));
    }
}
