import java.util.*;
public class FirstHalfSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        System.out.println("Enter 6 elements: ");
        int sum = 0;
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<a.length/2; i++){
            sum += a[i];
        }
        System.out.println("First-Half Sum of numbers in the Array: "+ sum);
    }
}
