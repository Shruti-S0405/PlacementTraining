import java.util.*;
public class MinOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter 5 elements: ");
        int min = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
            if(i%2!=0){
                if(a[i]<min){
                    min = a[i];
                }
            }
        }
        System.out.println("Minimum of Odd Indexed numbers in the Array: "+ min);
    }
}
