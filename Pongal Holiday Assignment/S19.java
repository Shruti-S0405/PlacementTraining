import java.util.*;
public class S19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        System.out.println("Enter 6 elements: ");
        int sum = 0;
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0; i<a.length/2; i++){
            count++;
            sum += a[i];
        }
        System.out.println("First-Half Avg Sum of numbers in the Array: "+ sum/count);
    }
}
