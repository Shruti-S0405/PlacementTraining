import java.util.*;
public class S17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        System.out.println("Enter 6 elements: ");
        int max = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<a.length/2; i++){
            if(a[i]>max) max = a[i];
        }
        System.out.println("Maximum in First-Half of the Array: "+ max);
    }
}
