import java.util.*;
public class S15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        System.out.println("Enter 6 elements: ");
        int min = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<a.length/2; i++){
            if(a[i]<min) min = a[i];
        }
        System.out.println("Minimum in First-Half of the Array: "+ min);
    }
}
